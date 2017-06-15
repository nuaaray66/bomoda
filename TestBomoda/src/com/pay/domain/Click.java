package com.pay.domain;

import java.io.Serializable;
import java.util.Date;

public class Click implements Serializable {
    /**
     * Click.ID (Source database incremental id)
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    private Integer id;

    /**
     * Click.URL (Corresponding page URL)
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    private String url;

    /**
     * Click.Title (Corresponding page title)
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    private String title;

    /**
     * Click.Read_Number (Page’s read number)
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    private Integer readNumber;

    /**
     * Click.Like_Number (Page’s like number)
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    private Integer likeNumber;

    /**
     * Click.Timestamp (Time of record creation)
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

    public Integer getReadNumber() {
        return readNumber;
    }

    public void setReadNumber(Integer readNumber) {
        this.readNumber = readNumber;
    }

    public Integer getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(Integer likeNumber) {
        this.likeNumber = likeNumber;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}