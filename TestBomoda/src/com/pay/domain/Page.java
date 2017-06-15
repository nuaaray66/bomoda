package com.pay.domain;

import java.io.Serializable;
import java.util.Date;

public class Page implements Serializable {
    /**
     * Page.ID (Source database incremental id)
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    private Integer id;

    /**
     * Page.URL (URL for page content)
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    private String url;

    /**
     * Page.Title (Page title)
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    private String title;

    /**
     * Page.Content (Page raw html content)
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    private String content;

    /**
     * Page.Timestamp (Time of record creation)
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    private Date timestamp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}