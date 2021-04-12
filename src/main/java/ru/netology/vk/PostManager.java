package ru.netology.vk;

public class PostManager {
    private Post posts;

    public Post getPosts() {
        return posts;
    }

    public void setPosts(Post posts) {
        this.posts = posts;
    }

    public Post[] search(/* критерии поиска*/) {
        // Просматриваем все элементы массива и находим все, которые удовлетворяют критериям поиска
        // Складываем найденные в новый массив
        return null; // а на самом деле новый массив
    }

    public Post[] delete(long postID) {
        // Просматриваем все элементы массива, находим нужный
        // Переписываем все кроме найденного в новый массив
        return null; // а на самом деле новый массив
    }
}
