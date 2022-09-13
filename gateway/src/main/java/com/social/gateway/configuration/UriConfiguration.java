package com.social.gateway.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "uri")
public class UriConfiguration {

    private String httpbin = "http://localhost:8765";
    private String postsUri = "http://localhost:8000";

    public String getHttpbin() {
        return httpbin;
    }

    public void setHttpbin(String httpbin) {
        this.httpbin = httpbin;
    }

    public String getPostsUri() {
        return postsUri;
    }

    public void setPostsUri(String postsUri) {
        this.postsUri = postsUri;
    }
}