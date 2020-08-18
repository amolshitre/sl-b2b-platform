package com.servicelive.orderfulfillment.orderprep.validator;

import com.servicelive.orderfulfillment.domain.ServiceOrder;
import com.servicelive.orderfulfillment.validation.IServiceOrderValidationTask;
import com.servicelive.orderfulfillment.validation.IServiceOrderValidator;
import com.servicelive.orderfulfillment.domain.ValidationHolder;

import java.util.List;

public class OrderEnhancementValidator implements IServiceOrderValidator {
    List<IServiceOrderValidationTask> validationTasks;

    public void validate(ServiceOrder serviceOrder, ValidationHolder validationHolder) {
        if (validationTasks != null) {
            for (IServiceOrderValidationTask validationTask : validationTasks) {
                validationTask.validate(serviceOrder, validationHolder);
            }
        }
    }

    public void setValidationTasks(List<IServiceOrderValidationTask> validationTasks) {
        this.validationTasks = validationTasks;
    }
}
