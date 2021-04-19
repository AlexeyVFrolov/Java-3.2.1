package ru.netology.vk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Post {

    private int postId; // Идентификатор поста
    private int ownerId;  // Идентификатор аккаунта, на стене которого размещен пост
    private int authorId; // Идентификатор аккаунта автора поста

    // сам не догадался
    private int createdBy; // идентификатор администратора

    private Calendar postDateAndTime; // Дата поста
    private String postText; // Текст поста
    private int replyOwnerId; // Идентификатор владельца записи, на которую была составлена текущая
    private int replyPostId; // Идентификатор записи, в ответ на которую была составлена текущая
    private boolean friendsOnly; // Создана ли запись с опцией "Только для друзей"

    // сам не догадался, хотел сделать массивы объектов
    private CommentsInfo commentsInfo; // Информация о комментариях к посту
    private Likes likes; // информация о лайках к записи
    private Repost repost; // информация о репостах записи
    private Views views; // информация о просмотрах записи
    private Copyright copyright; // источник материала

    // сам не догадался
    private String postType; // тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest.
    private PostSource postSource; // информация о способе размещения записи
    // private Attachments[] attachment; // Массив объектов вложения
    private Geo geo; // информация о местоположении
    private int signerId; // идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    // private CopyHistory copyHistory; // массив, содержащий историю репостов для записи

    private boolean canPin; //  Может ли текущий пользователь закрепить запись
    private boolean canDelete; // Может ли текущий пользователь удалить запись
    private boolean canEdit; // Может ли текущий пользователь редактировать запись
    private boolean isPinned; // Закреплена ли запись

    // сам не догадался
    private boolean markedAsAds; // содержит ли запись отметку "реклама"

    private boolean isFavorite; // Добавлена ли запись в закладки

    // сам не догадался
    private Donut donut; // информация о записи VK Donut

    private int postponerId; // идентификатор отложенной записи

}



