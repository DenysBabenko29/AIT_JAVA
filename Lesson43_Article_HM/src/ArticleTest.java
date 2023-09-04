import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArticleTest {
    Article article;

    @BeforeEach
    void setUp() {
        article = new Article("name1", "content1", "Denys", Article.State.DRAFT);
    }

    @Test
    void sendToReview() {
        article.sendToReview();
        assertTrue(article.isOnReview());
        article.setState(Article.State.ON_EDIT);
        article.sendToReview();
        assertTrue(article.isOnReview());
    }
    @Test
    void NotSendToReview() {
        article.setState(Article.State.DELETED);
        assertThrows(IllegalStateException.class, () -> article.sendToReview());
    }
    @Test
    void publish() {
        article.setState(Article.State.ON_REVIEW);
        article.publish();
        assertTrue(article.isPublished());
    }
    @Test
    void NotPublish() {
        assertThrows(IllegalStateException.class, () -> article.publish());
    }

    @Test
    void decline() {
        article.setState(Article.State.ON_REVIEW);
        article.decline();
        assertTrue(article.isDeclined());
    }
    @Test
    void NotDecline() {
        assertThrows(IllegalStateException.class, () -> article.decline());
    }

    @Test
    void delete() {
        article.setState(Article.State.PUBLISHED);
        article.delete();
        assertTrue(article.isDeleted());
        article.setState(Article.State.DECLINED);
        article.delete();
        assertTrue(article.isDeleted());
        article.setState(Article.State.ON_EDIT);
        article.delete();
        assertTrue(article.isDeleted());
    }
    @Test
    void NotDelete() {
        assertThrows(IllegalStateException.class, () -> article.delete());
    }

    @Test
    void edit() {
        article.setState(Article.State.DECLINED);
        article.edit();
        assertTrue(article.isOnEdit());
    }
    @Test
    void NotEdit() {
        assertThrows(IllegalStateException.class, () -> article.edit());
    }
}