package com.accp.forum.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * thread
 * @author 
 */
public class Thread implements Serializable {
    /**
     * 跟帖编号
     */
    private Integer threadId;

    /**
     * 文章编号
     */
    private Integer articleId;

    /**
     * 跟帖内容
     */
    private String threadContent;

    /**
     * 跟帖创建时间
     */
    private Date threadCreatetime;

    /**
     * 跟帖人
     */
    private Integer threadAuthor;

    /**
     * 顶
     */
    private Integer like;

    /**
     * 踩
     */
    private Integer trample;

    private static final long serialVersionUID = 1L;

    public Integer getThreadId() {
        return threadId;
    }

    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getThreadContent() {
        return threadContent;
    }

    public void setThreadContent(String threadContent) {
        this.threadContent = threadContent;
    }

    public Date getThreadCreatetime() {
        return threadCreatetime;
    }

    public void setThreadCreatetime(Date threadCreatetime) {
        this.threadCreatetime = threadCreatetime;
    }

    public Integer getThreadAuthor() {
        return threadAuthor;
    }

    public void setThreadAuthor(Integer threadAuthor) {
        this.threadAuthor = threadAuthor;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public Integer getTrample() {
        return trample;
    }

    public void setTrample(Integer trample) {
        this.trample = trample;
    }
}