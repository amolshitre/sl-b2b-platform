package com.servicelive.esb.actions;

import java.util.Date;

import org.apache.log4j.Logger;
import org.jboss.soa.esb.ConfigurationException;
import org.jboss.soa.esb.actions.ActionProcessingException;
import org.jboss.soa.esb.helpers.ConfigTree;
import org.jboss.soa.esb.message.Message;

import com.servicelive.esb.constant.MarketESBConstant;
import com.servicelive.esb.integration.domain.IntegrationName;

public class IntegrationCustomRefAction extends AbstractIntegrationSpringAction {
	
	private static final Logger logger = Logger.getLogger(IntegrationCustomRefAction.class);
	private static final String INTEGRATION_ID_PROPERTY_NAME = "integrationId";
	private Long integrationId;
	private IntegrationName integrationName;
	
	public IntegrationCustomRefAction() { super(); }
	public IntegrationCustomRefAction(ConfigTree config) throws ConfigurationException {
		super(config);
		String integrationIdAsString = config.getRequiredAttribute(INTEGRATION_ID_PROPERTY_NAME);
		Long integrationId;
		IntegrationName integrationName;
		
		try {
			integrationId = Long.parseLong(integrationIdAsString);
		}
		catch (NumberFormatException e) {
			throw new ConfigurationException(String.format("Unable to parse configured value '%s' for property '%s' as a long value.", integrationIdAsString, INTEGRATION_ID_PROPERTY_NAME), e);
		}
		
		try {
			integrationName = IntegrationName.fromId(integrationId);
		}
		catch (IllegalArgumentException e) {
			throw new ConfigurationException(String.format("Unable to understand configuration value %d supplied for property '%s'.", integrationId, INTEGRATION_ID_PROPERTY_NAME), e);
		}

		this.integrationId = integrationId;
		this.integrationName = integrationName;
	}	
	
	public Message mapCustomRefs(Message message) throws ActionProcessingException {
		final String methodName = "mapCustomRefs";
		logger.info(String.format("Entered %s", methodName));
		logger.info("***Entering mapCustomRefs in IntegrationCustomRefAction***time of action***"+new Date()+"Thread: "+Thread.currentThread().getId());
		long start = System.currentTimeMillis();
		Object fileFeedPropertyValue = message.getProperties().getProperty(MarketESBConstant.ORIGINAL_FILE_FEED_NAME);
		String inputFileName = String.valueOf(fileFeedPropertyValue == null ? "" : fileFeedPropertyValue);
		
		if (inputFileName != null) {
			try {
				this.getIntegrationServiceCoordinator().setCustomReferencesByInputFile(inputFileName);
			} catch (Exception e) {
				throw new ActionProcessingException(String.format("Error while setting custom references"), e);
			}
		}

		logger.info(String.format("Exiting %s", methodName));
		long end = System.currentTimeMillis();
		logger.info("***Exiting mapCustomRefs in IntegrationCustomRefAction***time of action***"+new Date()+"Thread: "+Thread.currentThread().getId());
		logger.info("***Exiting mapCustomRefs in IntegrationCustomRefAction***Time taken***"+(end-start));
		return message;
	}
	
	@Override
	protected Long getIntegrationId(String fileName) {
		return this.integrationId;
	}

	@Override
	protected String getIntegrationName(String fileName) {
		return this.integrationName == null ? null : this.integrationName.name();
	}
}
