package ait.forum.dao;

import ait.forum.model.Post;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class ForumImpl implements Forum{

    public static Comparator<Post> comparator = (p1, p2) -> {
        int res = p1.getAuthor().compareTo(p2.getAuthor());
        return res != 0 ? res : p1.getDate().compareTo(p2.getDate()) != 0 ? p1.getDate().compareTo(p2.getDate()) :
                Integer.compare(p2.getPostId(), p2.getPostId());
    };

    private Post[] posts;
    int size;

    public ForumImpl() {
        posts = new Post[0];
    }

    @Override
    public boolean addPost(Post post) {
        if (post == null || getPostById(post.getPostId()) != null){
            return false;
        }
        posts = Arrays.copyOf(posts, posts.length + 1);
        int index = Arrays.binarySearch(posts, 0, size, post, comparator);
        index = index >= 0 ? index : -index - 1;
        System.arraycopy(posts, index, posts, index + 1, size - index);
        posts[index] = post;
        size++;
        return true;
    }

    @Override
    public boolean removePost(int postId) {
        return false;
    }

    @Override
    public boolean updatePost(int postId, String content) {
        return false;
    }

    @Override
    public Post getPostById(int postId) {
        for (Post p : posts){
            if (p.getPostId() == postId) return p;
        }
        return null;
    }

    @Override
    public Post[] getPostByAuthor(String author) {
        return new Post[0];
    }

    @Override
    public Post[] getPostByAuthor(String author, LocalDate dateFrom, LocalDate dateTo) {
        return new Post[0];
    }

    @Override
    public int size() {
        return size;
    }
}
