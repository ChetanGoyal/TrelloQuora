package com.upgrad.quora.api.model;

public class ErrorResponse {

    private String code;
    private String message;
    private String rootCause;

    public ErrorResponse(String code, String message, String rootCause) {
        this.code = code;
        this.message = message;
        this.rootCause = rootCause;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRootCause() {
        return rootCause;
    }

    public void setRootCause(String rootCause) {
        this.rootCause = rootCause;
    }
}
