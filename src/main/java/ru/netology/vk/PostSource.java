package ru.netology.vk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PostSource {
    private String type; // тип источника
    private String platform; // название платформы, если оно доступно
    private String data; // тип действия
    private String url; // URL
}
