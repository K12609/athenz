//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.msd;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yahoo.rdl.*;

//
// TransportPolicyValidationRequest - Transport policy request object to be
// validated
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransportPolicyValidationRequest {
    public TransportPolicyEntitySelector entitySelector;
    public TransportPolicyPeer peer;
    public TransportPolicyTrafficDirection trafficDirection;

    public TransportPolicyValidationRequest setEntitySelector(TransportPolicyEntitySelector entitySelector) {
        this.entitySelector = entitySelector;
        return this;
    }
    public TransportPolicyEntitySelector getEntitySelector() {
        return entitySelector;
    }
    public TransportPolicyValidationRequest setPeer(TransportPolicyPeer peer) {
        this.peer = peer;
        return this;
    }
    public TransportPolicyPeer getPeer() {
        return peer;
    }
    public TransportPolicyValidationRequest setTrafficDirection(TransportPolicyTrafficDirection trafficDirection) {
        this.trafficDirection = trafficDirection;
        return this;
    }
    public TransportPolicyTrafficDirection getTrafficDirection() {
        return trafficDirection;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != TransportPolicyValidationRequest.class) {
                return false;
            }
            TransportPolicyValidationRequest a = (TransportPolicyValidationRequest) another;
            if (entitySelector == null ? a.entitySelector != null : !entitySelector.equals(a.entitySelector)) {
                return false;
            }
            if (peer == null ? a.peer != null : !peer.equals(a.peer)) {
                return false;
            }
            if (trafficDirection == null ? a.trafficDirection != null : !trafficDirection.equals(a.trafficDirection)) {
                return false;
            }
        }
        return true;
    }
}
