package ru.netology.vk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Place {
    private int id; // идентификатор мест
    private String title; // название места
    private int latiyude; // географическая широта, заданная в градусах (от -90 до 90)
    private int longitude; // географическая широта, заданная в градусах (от -90 до 90)
    private Calendar created; // дата создания места
    private String icon; // иконка места, URL изображения
    private int checkins; // число отметок в этом месте
    private Calendar updated; // дата обновления места
    private int type; // тип места
    private int country; // идентификатор страны
    private int city; // идентификатор города
    private int address; // адрес места
}
