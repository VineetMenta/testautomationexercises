package com.cnu.mentoring.vineet.cdp.designpatterns.builder;

public class Rest {
    private String status;
    private String baseUrl;
    private String basePath;

    private Rest(String status, String baseUrl, String basePath) {
        this.status = status;
        this.baseUrl = baseUrl;
        this.basePath = basePath;
    }

    public static class RestBuilder{
        private String status;
        private String baseUrl;
        private String basePath;

        public RestBuilder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public RestBuilder basePath(String basePath) {
            this.basePath = basePath;
            return this;
        }

        public RestBuilder status(String status){
            this.status=status;
            return this;
        }

        public Rest build() {
            return new Rest(this.status,this.baseUrl,this.basePath);
        }
    }
}
