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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchUpdateScheduleRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchUpdateScheduleRequestMarshaller {

    private static final MarshallingInfo<String> CHANNELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("channelId").build();
    private static final MarshallingInfo<StructuredPojo> CREATES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creates").build();
    private static final MarshallingInfo<StructuredPojo> DELETES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deletes").build();

    private static final BatchUpdateScheduleRequestMarshaller instance = new BatchUpdateScheduleRequestMarshaller();

    public static BatchUpdateScheduleRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchUpdateScheduleRequest batchUpdateScheduleRequest, ProtocolMarshaller protocolMarshaller) {

        if (batchUpdateScheduleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchUpdateScheduleRequest.getChannelId(), CHANNELID_BINDING);
            protocolMarshaller.marshall(batchUpdateScheduleRequest.getCreates(), CREATES_BINDING);
            protocolMarshaller.marshall(batchUpdateScheduleRequest.getDeletes(), DELETES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
