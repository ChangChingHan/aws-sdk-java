/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.acmpca.model;

import javax.annotation.Generated;

/**
 * <p>
 * The S3 bucket policy is not valid. The policy must give ACM PCA rights to read from and write to the bucket and find
 * the bucket location.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidPolicyException extends com.amazonaws.services.acmpca.model.AWSACMPCAException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidPolicyException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidPolicyException(String message) {
        super(message);
    }

}
