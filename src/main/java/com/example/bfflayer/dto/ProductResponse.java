package com.example.bfflayer.dto;

import org.springframework.stereotype.Component;

@Component
public class ProductResponse {
    int requestId;

    public int getRequestId() {
        return requestId;
    }
    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }
}
