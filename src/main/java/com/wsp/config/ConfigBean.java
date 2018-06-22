package com.wsp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 一个用来接受全局配置的类
 */
@ConfigurationProperties(prefix = "test")
public class ConfigBean {

    private String name ;


    private String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
