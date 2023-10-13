package com.segurostupapa.app.Shared.domain;

import java.util.HashMap;
import java.util.Optional;

public class CustomHttpResponse {
    private Integer status;
    private String message;
    private Optional<Object> data;

    public CustomHttpResponse(Integer status, String message) {
        this(status, message, Optional.empty());
    }

    public CustomHttpResponse(Integer status, String message, Object data) {
        this(status, message, Optional.ofNullable(data));
    }

    private CustomHttpResponse(Integer status, String message, Optional<Object> data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Optional<Object> getData() {
        return data;
    }

    public HashMap<String, Object> getResponseObject() {
        HashMap<String, Object> response = new HashMap<>();

        response.put("status", status);
        response.put("message", message);
        data.ifPresent(d -> response.put("data", d));

        return response;
    }
}
