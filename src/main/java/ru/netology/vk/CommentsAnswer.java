package ru.netology.vk;

import java.util.Calendar;

public class CommentsAnswer {

    private long answerId; // Идентификатор комментария
    private Calendar answerDateAndTime; // Дата и время комментария
    private int numberOfLikes; // Количество лайков
    private String[] whoLiked; // Массив Id кому понравился комментарий

    public long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(long answerId) {
        this.answerId = answerId;
    }

    public Calendar getAnswerDateAndTime() {
        return answerDateAndTime;
    }

    public void setAnswerDateAndTime(Calendar answerDateAndTime) {
        this.answerDateAndTime = answerDateAndTime;
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
