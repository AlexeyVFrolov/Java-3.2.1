package ru.netology.vk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CommentsInfo {

    private int count; // количество комментариев
    private boolean canPost; // может ли текущий пользователь комментировать запись
    private boolean groupsCanPost; // могут ли сообщества комментировать запись
    private boolean canClose; // может ли текущий пользователь закрыть комментари к записи
    private boolean canOpen; // может ли текущий пользователь открыть комментарии к записи

}
