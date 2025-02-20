/*
 *
 *  * Copyright The Athenz Authors
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.yahoo.athenz.common.messaging;

import java.util.Objects;

public class DomainChangeMessage {
    
    // Represent the changed object type 
    enum ObjectType {
        DOMAIN, 
        ROLE, 
        POLICY, 
        SERVICE, 
        ENTITY
    } 
    
    private String domainName;
    
     // Domain change message id     
    private String uuid;
   
    // The number of milliseconds since the epoch 
    private long published;
    
    private ObjectType objectType;
    
    // The changed object name based on {@param objectType}
    private String objectName;
    
    // The type of operation that was performed
    private String apiName;

    public String getDomainName() {
        return domainName;
    }

    public DomainChangeMessage setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    public String getUuid() {
        return uuid;
    }

    public DomainChangeMessage setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public long getPublished() {
        return published;
    }

    public DomainChangeMessage setPublished(long published) {
        this.published = published;
        return this;
    }

    public ObjectType getObjectType() {
        return objectType;
    }

    public DomainChangeMessage setObjectType(ObjectType objectType) {
        this.objectType = objectType;
        return this;
    }

    public String getObjectName() {
        return objectName;
    }

    public DomainChangeMessage setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    public String getApiName() {
        return apiName;
    }

    public DomainChangeMessage setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DomainChangeMessage that = (DomainChangeMessage) o;
        return published == that.published && 
            domainName.equals(that.domainName) && 
            uuid.equals(that.uuid) && 
            objectType == that.objectType && 
            objectName.equals(that.objectName) && 
            apiName.equals(that.apiName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName, uuid, published, objectType, objectName, apiName);
    }
}
