package com.cnu.mentoring.vineet.cdp.designpatterns.builderpattern;

public class Rest {

    private int cookie;
    private String baseUrl;
    private String basePath;

    private Rest(){}

    public static class RestBuilder{
        private int cookie;
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

        public RestBuilder cookie(int cookie){
            this.cookie=cookie;
            return this;
        }

        public Rest build() {
            Rest rest = new Rest();
            rest.cookie = this.cookie;
            rest.baseUrl = this.baseUrl;
            rest.basePath = this.basePath;
            return rest;
        }
    }

    @Override
    public String toString() {
        return "Rest{" +
                "cookie=" + cookie +
                ", baseUrl='" + baseUrl + '\'' +
                ", basePath='" + basePath + '\'' +
                '}';
    }
}
