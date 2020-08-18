package com.newco.marketplace.api.mobile.utils.mappers;

import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;

import com.newco.marketplace.api.mobile.beans.MobileTimeOnSiteRequest;
import com.newco.marketplace.api.mobile.constants.PublicMobileAPIConstant;
import com.newco.marketplace.vo.mobile.MobileSOOnsiteVisitVO;
import com.newco.marketplace.vo.mobile.ServiceOrder;
import com.servicelive.orderfulfillment.domain.SOOnSiteVisit;

public class MobileTimeOnSiteMapper {

	private Logger logger = Logger.getLogger(MobileTimeOnSiteMapper.class);

	/**
	 * Generates the SOOnSiteVisit object to call the OF Signal
	 * 
	 * @param onsiteVisitVO
	 * @return
	 */
	public SOOnSiteVisit mapSOOnsiteVisitForOF(
			MobileSOOnsiteVisitVO onsiteVisitVO) {
		SOOnSiteVisit onSiteVisit = new SOOnSiteVisit();
		onSiteVisit.setArrivalDate(onsiteVisitVO.getArrivalDate());
		onSiteVisit
				.setArrivalInputMethod(onsiteVisitVO.getArrivalInputMethod());
		onSiteVisit.setDeleteIndicator(onsiteVisitVO.getDeleteInd());
		if (onsiteVisitVO.getDepartureCondition() != null)
			onSiteVisit.setDepartureCondition(onsiteVisitVO
					.getDepartureCondition().toString());
		onSiteVisit.setDepartureDate(onsiteVisitVO.getDepartureDate());
		onSiteVisit.setDepartureInputMethod(onsiteVisitVO
				.getDepartureInputMethod());
		if (onsiteVisitVO.getDepartureResourceId() != null)
			onSiteVisit.setDepartureResourceId((long) onsiteVisitVO
					.getDepartureResourceId());
		onSiteVisit.setIvrCreateDate(onsiteVisitVO.getIvrcreatedate());
		if (onsiteVisitVO.getResourceId() != null)
			onSiteVisit.setResourceId((long) onsiteVisitVO.getResourceId());

		/*
		 * adding the new latitude and longitude fields to the OnSiteVisit
		 * entity for Mobile time on site API
		 */
		onSiteVisit.setArrivalLatitude(onsiteVisitVO.getArrivalLatitude());
		onSiteVisit.setArrivalLongitude(onsiteVisitVO.getArrivalLongitude());
		onSiteVisit.setDepartureLatitude(onsiteVisitVO.getDepartureLatitude());
		onSiteVisit
				.setDepartureLongitude(onsiteVisitVO.getDepartureLongitude());

		return onSiteVisit;
	}

	/**
	 * Generates the OnSiteVisit VO object for insert and update
	 * 
	 * @param so
	 * @param eventType
	 * @param currentDate
	 * @return
	 */
	public MobileSOOnsiteVisitVO mapSOOnsiteVisitVO(
			MobileSOOnsiteVisitVO onsiteVisitVO, ServiceOrder so,
			MobileTimeOnSiteRequest mobileTimeonSiteRequest, Date currentDate) {
		// create the VO object in case of insert
		if (null == onsiteVisitVO) {
			onsiteVisitVO = new MobileSOOnsiteVisitVO();
		}

		Calendar cal = Calendar.getInstance();
		Date createdDate = cal.getTime();

		// getting the values from the request object
		String eventType = mobileTimeonSiteRequest.getEventType();
		Double latitude = mobileTimeonSiteRequest.getLatitude();
		Double longitide = mobileTimeonSiteRequest.getLongitude();

		// setting values for arrival time
		if (PublicMobileAPIConstant.EVENT_TYPE_ARRIVAL.equals(eventType)) {
			if (logger.isInfoEnabled()) {
				logger.info("Event type is Arrival " + eventType);
			}
			onsiteVisitVO.setSoId(so.getSoId());
			onsiteVisitVO.setArrivalDate(currentDate);
			onsiteVisitVO.setArrivalInputMethod(PublicMobileAPIConstant.ONSITE_VISIT_INPUT_METHOD);
			onsiteVisitVO.setResourceId(so.getAcceptedResourceId());
			onsiteVisitVO.setCreatedDate(createdDate);
			onsiteVisitVO
					.setDeleteInd(PublicMobileAPIConstant.ONSITE_DELETE_IND);

			// set latitude and longitude for arrival event
			onsiteVisitVO.setArrivalLatitude(latitude);
			onsiteVisitVO.setArrivalLongitude(longitide);
		} else if (PublicMobileAPIConstant.EVENT_TYPE_DEPARTURE
				.equals(eventType)) {
			// setting common values for departure
			onsiteVisitVO.setDepartureDate(currentDate);
			onsiteVisitVO.setDepartureInputMethod(PublicMobileAPIConstant.ONSITE_VISIT_INPUT_METHOD);
			onsiteVisitVO.setDepartureResourceId(so.getAcceptedResourceId());

			// departure in case of update
			if (null != onsiteVisitVO.getArrivalDate()) {
				if (logger.isInfoEnabled()) {
					logger.info("Inside update departure date");
				}
				onsiteVisitVO.setModifiedDate(createdDate);
			} else {
				// departure details in case of insert
				if (logger.isInfoEnabled()) {
					logger.info("Inside insert departure date");
				}
				onsiteVisitVO.setSoId(so.getSoId());
				onsiteVisitVO.setCreatedDate(createdDate);
				onsiteVisitVO
						.setDeleteInd(PublicMobileAPIConstant.ONSITE_DELETE_IND);
			}

			// set latitude and longitude for departure event
			onsiteVisitVO.setDepartureLatitude(latitude);
			onsiteVisitVO.setDepartureLongitude(longitide);
		}

		return onsiteVisitVO;
	}
}
