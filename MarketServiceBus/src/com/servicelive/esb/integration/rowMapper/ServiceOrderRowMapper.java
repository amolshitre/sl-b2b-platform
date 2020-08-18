package com.servicelive.esb.integration.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.servicelive.esb.integration.domain.ServiceOrder;

public class ServiceOrderRowMapper extends AbstractIntegrationDomainRowMapper<ServiceOrder> {
	public ServiceOrder mapRow(ResultSet rs, int row) throws SQLException {
        ServiceOrder returnVal = new ServiceOrder(
        		rs.getLong("serviceOrderId"),
        		getNullOrValueFrom(rs.getLong("transactionId"), rs.wasNull()),
        		getNullOrValueFrom(rs.getBlob("customRefs"), rs.wasNull()));
        return returnVal;
    }
}