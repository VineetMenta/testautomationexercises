package com.cnu.mentoring.vineet.cdp.designpatterns;

public class Client {
    public static void main(String[] args) {

        Rest.RestBuilder builder = new Rest.RestBuilder();

        Rest rest = builder.build();
        builder.status("200").basePath("/users").build();
    }
}
