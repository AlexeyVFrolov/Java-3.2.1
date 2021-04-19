package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.vk.Post;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PostManager {
    private Post[] posts;

    public Post[] search(int ownerId, String domain, String query, boolean ownersOnly, int count, int offset) {
        return null;
    }

    public void delete(int ownerId, int postId) {
    }
}
