package com.longsemi.oa.manager.bean;

public class Menu {
    private String id;

    private String name;

    private Integer pid;

    private String icon;

    private String url;

    private String app;

    private String app1;

    private String app2;

    private String app3;

    private String app4;

    private String app5;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app == null ? null : app.trim();
    }

    public String getApp1() {
        return app1;
    }

    public void setApp1(String app1) {
        this.app1 = app1 == null ? null : app1.trim();
    }

    public String getApp2() {
        return app2;
    }

    public void setApp2(String app2) {
        this.app2 = app2 == null ? null : app2.trim();
    }

    public String getApp3() {
        return app3;
    }

    public void setApp3(String app3) {
        this.app3 = app3 == null ? null : app3.trim();
    }

    public String getApp4() {
        return app4;
    }

    public void setApp4(String app4) {
        this.app4 = app4 == null ? null : app4.trim();
    }

    public String getApp5() {
        return app5;
    }

    public void setApp5(String app5) {
        this.app5 = app5 == null ? null : app5.trim();
    }
}