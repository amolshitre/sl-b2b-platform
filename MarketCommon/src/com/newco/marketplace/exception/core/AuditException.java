/**
 * Copyright
 * (c) 2007 Sears Holding, Inc.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Sears Holding, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Sears Holding, Inc.
 *
 * Copyright (c) 2007 Sears Holding, Inc.
 *
 * All rights reserved.
 * See the LICENSE.txt file for the terms of use and distribution.
 *
 * $Id: AuditException.java,v 1.3 2008/04/26 00:51:54 glacy Exp $
 */

package com.newco.marketplace.exception.core;

import com.newco.marketplace.interfaces.AuditStatesInterface;

/**
 * BusinessServiceExcepiton is thrown by the business service. This means all
 * the business bean Objects should throw only the BusinessServiceException. Any
 * Exceptions that are from the component at lower level should be wrapped by
 * the this exception, so a meaningful error message can be returned.
 * 
 */
public class AuditException extends ResolvableException implements AuditStatesInterface{

    private static final long serialVersionUID = 1L;

    /**
     * Creates new <code>BusinessServiceException</code> without detail
     * message.
     * 
     * @param message
     *            Error message that identifies the application problem.
     * @param cause
     *            The actual exception that was caught.
     */
    public AuditException(String message, Exception cause) {
        super(message, cause);
    }

    /**
     * Creates new <code>BusinessServiceException</code> without detail
     * message.
     * 
     * @param message
     *            Error message that identifies the application problem.
     */
    public AuditException (String message) {

        super(message);
    }
}