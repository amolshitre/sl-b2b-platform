package com.servicelive.orderfulfillment.command;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Map;
import com.servicelive.domain.pendingcancel.PendingCancelHistory;
import com.servicelive.orderfulfillment.domain.ServiceOrder;
import com.servicelive.orderfulfillment.serviceinterface.OrderfulfillmentConstants;


public class UpdatePendingCancelHistoryCmd extends SOCommand {

	@Override
	public void execute(Map<String, Object> processVariables) {
		

		ServiceOrder so = getServiceOrder(processVariables);
		
		PendingCancelHistory pendingCancelHistory = new PendingCancelHistory();

		Object comments = processVariables
				.get(OrderfulfillmentConstants.PVKEY_CANCELLATION_COMMENT);
		if (comments != null) {
			pendingCancelHistory.setComments(comments.toString());
		}
		Object price = processVariables
				.get(OrderfulfillmentConstants.PVKEY_RQSTD_ACTIVE_CANCELLATION_AMT);
		if (price != null) {
			NumberFormat formatter = new DecimalFormat("###0.00");
			String cancelPrice=formatter.format(Double.parseDouble(price.toString()));
			processVariables
			.put(OrderfulfillmentConstants.PVKEY_RQSTD_ACTIVE_CANCELLATION_AMT,cancelPrice);
            pendingCancelHistory.setPrice(Double.parseDouble(price.toString()));
		}

		Object adminUserName = processVariables
				.get(OrderfulfillmentConstants.PVKEY_ADMIN_USER_NAME);
		if (adminUserName != null) {
			pendingCancelHistory.setAdminUserName(adminUserName.toString());
		}

		Object adminResourceId = processVariables
				.get(OrderfulfillmentConstants.PVKEY_ADMIN_USER_ID);
		if (adminResourceId != null && !adminResourceId.toString().equals("")) {
			pendingCancelHistory.setAdminResourceId(Integer
					.parseInt(adminResourceId.toString()));
		}

		Object userName = processVariables
				.get(OrderfulfillmentConstants.PVKEY_MODIFIED_USER_NAME);
		if (userName != null) {
			pendingCancelHistory.setModifiedBy(userName.toString());
			// processVariables.put(OrderfulfillmentConstants.PVKEY_PENDING_CANCEL_FIRMNAME ,userName.toString());

		}

		Object userId = processVariables
				.get(OrderfulfillmentConstants.PVKEY_MODIFIED_USER_ID);
		if (userId != null && !userId.toString().equals("")) {
			pendingCancelHistory.setUserId(Integer.parseInt(userId.toString()));
		}

		pendingCancelHistory.setRoleId(OrderfulfillmentConstants.BUYER_ROLE_ID);
		pendingCancelHistory.setSoId(so.getSoId());
		pendingCancelHistory.setWithdrawFlag(false);
		serviceOrderDao.pendingCancelUpdation(pendingCancelHistory);
		

	}

}
