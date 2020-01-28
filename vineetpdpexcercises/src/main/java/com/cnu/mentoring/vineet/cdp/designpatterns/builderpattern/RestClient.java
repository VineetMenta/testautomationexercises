package com.cnu.mentoring.vineet.cdp.designpatterns.builderpattern;

public class RestClient {
    public static void main(String[] args) {
        Rest restCall = new Rest.RestBuilder().cookie(12345678).baseUrl("https://random.api.com").basePath("/get/2").build();
        System.out.println(restCall);
    }
}
