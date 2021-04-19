package ru.netology.vk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Likes {
    private int count; // число пользователей, кторым понравилась запись
    private boolean userLikes; // наличие лайка от текущего пользователя
    private boolean canLike; // может ли текущий пользователь поставить лайк

    //А ЧЕГО ЭТО ЗДЕСЬ-ТО?
    private boolean canPublish; // может ли текущий пользователь сделать репост записи
}
