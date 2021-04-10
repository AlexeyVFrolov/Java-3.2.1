package ru.netology.vk;

import java.util.Calendar;

public class Post {

    private long postId; // Идентификатор поста
    private Calendar postDateAndTime; // Дата поста
    private String postStatus; // Опубликован, отложен, в архиве
    private String whoIsAllowedToSeeThisPost; // Кто может видеть пост
    private String postSubjectMatter; // Тема поста
    private boolean sendNotification; // Отправлять ли уведомление
    private String authorId; // Идентификатор аккаунта автора поста
    private String ownerId;  // Идентификатор аккаунта, на стене которого размещен пост
    private String postText; // Текст поста
    private boolean posterMode; // Оформление записи в виде постера. Да/Нет
    private int posterModeId; // Идентификатор темы постера
    private boolean commentsAllowed; // Разрешено ли комментировать пост
    private CommentsInfo[] commentsInfo; // Массив объектов комментариев к посту
    private Attachement[] attachment; // Массив объектов вложения
    private int numberOfLikes; // Количество лайков
    private String[] whoLiked; // Массив Id кому понравился пост
    private int numberOfViews; // Сколько раз просматривали пост

    public Calendar getPostDateAndTime() {
        return postDateAndTime;
    }

    public void setPostDateAndTime(Calendar postDateAndTime) {
        this.postDateAndTime = postDateAndTime;
    }

    public void setAttachment(Attachement[] attachment) {
        this.attachment = attachment;
    }

    public Attachement[] getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachement[] attachement) {
        this.attachment = attachement;
    }

    public int getNumberOfViews() {
        return numberOfViews;
    }

    public void setNumberOfViews(int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }

    public String[] getWhoLiked() {
        return whoLiked;
    }

    public void setWhoLiked(String[] whoLiked) {
        this.whoLiked = whoLiked;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public CommentsInfo[] getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo[] commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public boolean isCommentsAllowed() {
        return commentsAllowed;
    }

    public void setCommentsAllowed(boolean commentsAllowed) {
        this.commentsAllowed = commentsAllowed;
    }

    public boolean isSendNotification() {
        return sendNotification;
    }

    public void setSendNotification(boolean sendNotification) {
        this.sendNotification = sendNotification;
    }

    public String getPostSubjectMatter() {
        return postSubjectMatter;
    }

    public void setPostSubjectMatter(String postSubjectMatter) {
        this.postSubjectMatter = postSubjectMatter;
    }

    public String getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(String postStatus) {
        this.postStatus = postStatus;
    }

    public String getWhoIsAllowedToSeeThisPost() {
        return whoIsAllowedToSeeThisPost;
    }

    public void setWhoIsAllowedToSeeThisPost(String whoIsAllowedToSeeThisPost) {
        this.whoIsAllowedToSeeThisPost = whoIsAllowedToSeeThisPost;
    }

    public int getPosterModeId() {
        return posterModeId;
    }

    public void setPosterModeId(int posterModeId) {
        this.posterModeId = posterModeId;
    }

    public boolean isPosterMode() {
        return posterMode;
    }

    public void setPosterMode(boolean posterMode) {
        this.posterMode = posterMode;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

}
