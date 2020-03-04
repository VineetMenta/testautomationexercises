package com.cnu.mentoring.vineet.cdp.java8.pojos;

public class Response {

    int statusCode;
    String responseBody;
    String responseType;

    private Response(){}

    public Response(int statusCode, String responseBody, String responseType) {
        this.statusCode = statusCode;
        this.responseBody = responseBody;
        this.responseType = responseType;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    @Override
    public String toString() {
        return "Response{" +
                "statusCode=" + statusCode +
                ", responseBody='" + responseBody + '\'' +
                ", responseType='" + responseType + '\'' +
                '}';
    }
}
