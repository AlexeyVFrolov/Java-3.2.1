package ru.netology.vk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Geo {
    private String type; // тип места
    private String coordinates; // координаты места
    private Place place; // описание места

}
