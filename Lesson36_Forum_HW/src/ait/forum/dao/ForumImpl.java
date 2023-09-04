package ait.forum.dao;

import ait.forum.model.Post;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class ForumImpl implements Forum {

    private static Comparator<Post> comparator = (p1, p2) -> {
        int temp = p1.getAuthor().compareTo(p2.getAuthor());
        return temp != 0 ? temp : p1.getDate().compareTo(p2.getDate()) != 0 ? p1.getDate().compareTo(p2.getDate()) : p1.compareTo(p2);
    };
    private Post[] posts;
    private int size;

    public ForumImpl() {
        posts = new Post[0];
    }

    @Override
    public boolean addPost(Post post) {
        if (post == null){
            throw new RuntimeException();
        }
        if (getPostById(post.getPostId()) != null){
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
        int index = searchById(postId);
        if (index < 0) {
            return false;
        }
        System.arraycopy(posts, index + 1, posts, index, size - index - 1);
        posts = Arrays.copyOf(posts, posts.length - 1);
        size--;
        return true;
    }

    @Override
    public boolean updatePost(int postId, String newContent) {
        int index = searchById(postId);
        if (index < 0) {
            return false;
        }
        posts[index].setContent(newContent);
        return true;
    }

    @Override
    public Post getPostById(int postId) {
        int index = searchById(postId);
        if (index < 0) {
            return null;
        }
        return posts[index];
    }

    @Override
    public Post[] getPostsByAuthor(String author) {
        Post pattern = new Post(Integer.MIN_VALUE, author, null, null);
        pattern.setDate(LocalDateTime.MIN);
        int from = -Arrays.binarySearch(posts, pattern, comparator) - 1;
        pattern = new Post(Integer.MAX_VALUE, author, null, null);
        pattern.setDate(LocalDateTime.MAX);
        int to = -Arrays.binarySearch(posts, pattern, comparator) - 1;
        return Arrays.copyOfRange(posts, from, to);
    }

    @Override
    public Post[] getPostsByAuthor(String author, LocalDate dateFrom, LocalDate dateTo) {
        Post pattern = new Post(Integer.MIN_VALUE, author, null, null);
        pattern.setDate(dateFrom.atStartOfDay());
        int from = -Arrays.binarySearch(posts, 0, size, pattern, comparator) - 1;
        pattern = new Post(Integer.MAX_VALUE, author, null, null);
        pattern.setDate(LocalDateTime.of(dateTo, LocalTime.MAX));
        int to = -Arrays.binarySearch(posts, 0, size, pattern, comparator) - 1;
        return Arrays.copyOfRange(posts, from, to);
    }

    @Override
    public int size() {
        return size;
    }

    private int searchById(int postId) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getPostId() == postId) {
                return i;
            }
        }
        return -1;
    }

    public boolean testException(Post post) {
        if (post == null) {
            throw new NullPointerException();
        }
        if (getPostById(post.getPostId()) != null) {
            throw new IllegalArgumentException();
        }
        return true;
    }
}