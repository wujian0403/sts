package com.accp.forum.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * reply
 * @author 
 */
public class Reply implements Serializable {
    /**
     * 回复编号
     */
    private Integer replyId;

    /**
     * 回复人
     */
    private Integer replyAuthor;

    /**
     * 被回复人
     */
    private Integer byReply;

    /**
     * 回复内容
     */
    private String replyContent;

    /**
     * 回复时间
     */
    private Date replyCreatetime;

    /**
     * 顶
     */
    private Integer like;

    /**
     * 踩
     */
    private Integer trample;

    /**
     * 所属文章
     */
    private Integer articleId;
    
    private Reply reply;

    private static final long serialVersionUID = 1L;

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Reply getReply() {
		return reply;
	}

	public void setReply(Reply reply) {
		this.reply = reply;
	}

	public Integer getReplyAuthor() {
        return replyAuthor;
    }

    public void setReplyAuthor(Integer replyAuthor) {
        this.replyAuthor = replyAuthor;
    }

    public Integer getByReply() {
        return byReply;
    }

    public void setByReply(Integer byReply) {
        this.byReply = byReply;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public Date getReplyCreatetime() {
        return replyCreatetime;
    }

    public void setReplyCreatetime(Date replyCreatetime) {
        this.replyCreatetime = replyCreatetime;
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

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }
}