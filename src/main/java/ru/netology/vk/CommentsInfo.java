package ru.netology.vk;

import java.util.Calendar;

public class CommentsInfo {

    private long commentId; // Идентификатор комментария
    private Calendar commentDateAndTime; // Дата и время комментария
    private CommentsAnswer[] commentsAnswers; // Массив ответов на комментарий
    private int numberOfLikes; // Количество лайков
    private String[] whoLiked; // Массив Id кому понравился комментарий

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    public Calendar getCommentDateAndTime() {
        return commentDateAndTime;
    }

    public void setCommentDateAndTime(Calendar commentDateAndTime) {
        this.commentDateAndTime = commentDateAndTime;
    }

    public CommentsAnswer[] getCommentsAnswers() {
        return commentsAnswers;
    }

    public void setCommentsAnswers(CommentsAnswer[] commentsAnswers) {
        this.commentsAnswers = commentsAnswers;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public String[] getWhoLiked() {
        return whoLiked;
    }

    public void setWhoLiked(String[] whoLiked) {
        this.whoLiked = whoLiked;
    }

}
