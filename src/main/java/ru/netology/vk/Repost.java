package ru.netology.vk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Repost {
    private int counter; // число пользователей, скопировавших запись
    private boolean userReposted; // наличие репоста от текущего пользователя
}
