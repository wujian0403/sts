package com.accp.forum.pojo;

import java.io.Serializable;

/**
 * appraise
 * @author 
 */
public class Appraise implements Serializable {
    /**
     * 评价id
     */
    private Integer appraiseId;

    /**
     * 被评价人id
     */
    private Integer threadId;

    /**
     * 评价人
     */
    private Integer appraiseAuthor;

    private static final long serialVersionUID = 1L;

    public Integer getAppraiseId() {
        return appraiseId;
    }

    public void setAppraiseId(Integer appraiseId) {
        this.appraiseId = appraiseId;
    }

    public Integer getThreadId() {
        return threadId;
    }

    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    public Integer getAppraiseAuthor() {
        return appraiseAuthor;
    }

    public void setAppraiseAuthor(Integer appraiseAuthor) {
        this.appraiseAuthor = appraiseAuthor;
    }
}