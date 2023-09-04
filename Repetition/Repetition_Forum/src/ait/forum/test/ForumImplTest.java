package ait.forum.test;

import ait.forum.dao.ForumImpl;
import ait.forum.model.Post;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ForumImplTest {
    ForumImpl forum = new ForumImpl();
    Post[] posts = new Post[5];

    @BeforeEach
    void setUp() {
        posts[0] = new Post(4, "title1", "author1", "content1");
        posts[1] = new Post(3, "title2", "author2", "content2");
        posts[2] = new Post(2, "title3", "author3", "content3");
        posts[3] = new Post(6, "title4", "author2", "content4");
        posts[4] = new Post(1, "title5", "author1", "content5");
        for (Post p : posts){
            forum.addPost(p);
        }

    }

    @Test
    void addPost() {
        assertFalse(forum.addPost(null));
        assertFalse(forum.addPost(posts[1]));
        Post post = new Post(5, "title4", "author3", "content4");
        assertTrue(forum.addPost(post));
        assertEquals(6, forum.size());
    }

    @Test
    void removePost() {
        assertFalse(forum.removePost(5));
        assertTrue(forum.removePost(1));
        assertEquals(4, forum.size());
        assertNull(forum.getPostById(1));
    }

    @Test
    void updatePost() {
        assertFalse(forum.updatePost(5, "newContent"));
        assertTrue(forum.updatePost(1, "newContent"));
        assertEquals(forum.getPostById(1).getContent(), "newContent");
    }

    @Test
    void getPostById() {
        assertNull(forum.getPostById(5));
        assertEquals(posts[0], forum.getPostById(1));
    }

    @Test
    void getPostByAuthor() {
        Post[] actual = forum.getPostByAuthor("author1");
        Arrays.sort(actual);
        Post[] expected = {posts[4], posts[0]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testGetPostByAuthor() {
        posts[0].setDate(LocalDateTime.now().minusDays(10));
        posts[1].setDate(LocalDateTime.now().minusDays(9));
        posts[2].setDate(LocalDateTime.now().minusDays(8));
        posts[3].setDate(LocalDateTime.now().minusDays(7));
        posts[4].setDate(LocalDateTime.now().minusDays(6));
        forum = new ForumImpl();
        for (Post p : posts){
            forum.addPost(p);
        }
        Post[] actual = forum.getPostByAuthor("author2", LocalDate.now().minusDays(9), LocalDate.now().minusDays(7));
        Arrays.sort(actual);
        Post[] expected = {posts[1], posts[3]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void size() {
        assertEquals(5, forum.size());
    }
}