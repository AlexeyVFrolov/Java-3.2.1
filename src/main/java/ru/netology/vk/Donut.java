package ru.netology.vk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Donut {
    private boolean isDonut; // доступна ли запись (запись доступна только платным подписчикам VK Donut)
    private int paidDuration; // время, в течение которого запись будет доступна только платным подписчикам VK Donut
    // private PlaceHolder placeHolder; // заглушка для пользователей, которые не оформили подписку VK Donut. Отображается вместо содержимого записи
    private boolean canPublishFreeCopy; // можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut
    private String editMode; // информация о том, какие значения VK Donut можно изменить в записи
}
