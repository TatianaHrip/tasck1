package ru.netology.domain;

import java.util.Date;

public class Post {
    private long id;
    private long ownerId;
    private Date publicationTime;
    private String text;
    private MediaContent mediaContent;
    private long[] likesIdInfo;
    private int PostComment
    postcomment;
    private CommentsInfo comentsinfo;


    public long[] getLikesIdInfo() {
        return likesIdInfo;
    }

    public void setLikesIdInfo(long[] likesIdInfo) {
        this.likesIdInfo = likesIdInfo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public Date getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(Date publicationTime) {
        this.publicationTime = publicationTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public MediaContent getMediaContent() {
        return mediaContent;
    }

    public void setMediaContent(MediaContent mediaContent) {
        this.mediaContent = mediaContent;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }
}