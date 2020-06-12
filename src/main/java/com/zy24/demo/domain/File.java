package com.zy24.demo.domain;

import java.util.Date;
import java.io.Serializable;

/**
 * (File)实体类
 *
 * @author makejava
 * @since 2020-06-12 09:19:46
 */
public class File implements Serializable {
    private static final long serialVersionUID = -40476767321235010L;
    
    private Long id;
    
    private String fileName;
    
    private String fileUrl;
    
    private Date fileCreateTime;
    
    private Long fileSearchTime;
    
    private Integer parent;

    private String creator;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Date getFileCreateTime() {
        return fileCreateTime;
    }

    public void setFileCreateTime(Date fileCreateTime) {
        this.fileCreateTime = fileCreateTime;
    }

    public Long getFileSearchTime() {
        return fileSearchTime;
    }

    public void setFileSearchTime(Long fileSearchTime) {
        this.fileSearchTime = fileSearchTime;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

}