package com.pay.domain;

import java.io.Serializable;
import java.util.Date;

public class Biz implements Serializable {
    /**
     * Biz.ID (Source database incremental id)
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    private Integer id;

    /**
     * Biz.Biz_ID (Biz account unique id)
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    private String bizId;

    /**
     * Biz.Biz_Name (Account name shown on the platform)
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    private String bizName;

    /**
     * Biz.Biz_Code (Account registered name)
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    private String bizCode;

    /**
     * Biz.Biz_Description (Description of account)
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    private String bizDescription;

    /**
     * Biz.QRcode (Account’s QR code)
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    private String qrcode;

    /**
     * Biz.Timestamp (Time of record creation)
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    private Date timestamp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
    }

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public String getBizDescription() {
        return bizDescription;
    }

    public void setBizDescription(String bizDescription) {
        this.bizDescription = bizDescription;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}