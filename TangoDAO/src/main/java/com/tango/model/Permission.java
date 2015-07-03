package com.tango.model;

public class Permission {
    private String url;
    private String uniqueName;

    public Permission(String url, String uniqueName) {
        this.url = url;
        this.uniqueName = uniqueName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

}
