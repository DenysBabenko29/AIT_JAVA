import java.util.function.Predicate;

public class Article {

    public enum State {
        DRAFT, ON_REVIEW, PUBLISHED, DECLINED, DELETED, ON_EDIT
    }

    private String name;
    private String content;
    private String author;
    private State state;

    public Article(String name, String content, String author, State state) {
        this.name = name;
        this.content = content;
        this.author = author;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public State getState() {
        return state;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setState(State state) {
        this.state = state;
    }


    public void sendToReview() {
        if (isDraft() || isOnEdit()) {
            this.state = State.ON_REVIEW;
        } else {
            throw new IllegalStateException("cannot be submitted for review. Сurrent state: " + this.state);
        }
    }

    public void publish() {
        if (isOnReview()) {
            this.state = State.PUBLISHED;
        } else {
            throw new IllegalStateException("Can't be published, Сurrent state: " + this.state);
        }
    }

    public void decline() {
        if (isOnReview()) {
            this.state = State.DECLINED;
        } else {
            throw new IllegalStateException("Сan't be rejected, Сurrent state: " + this.state);
        }
    }

    public void delete() {
        if (isPublished() || isDeclined() || isOnEdit()) {
            this.state = State.DELETED;
        } else {
            throw new IllegalStateException("cannot be deleted, Сurrent state: " + this.state);
        }
    }

    public void edit() {
        if (isDeclined()) {
            this.state = State.ON_EDIT;
        } else {
            throw new IllegalStateException("cannot be submitted for editing, Сurrent state: " + this.state);
        }
    }

    public boolean isDraft() {
        return this.state.equals(State.DRAFT);
    }

    public boolean isOnReview() {
        return this.state.equals(State.ON_REVIEW);
    }

    public boolean isPublished() {
        return this.state.equals(State.PUBLISHED);
    }

    public boolean isDeclined() {
        return this.state.equals(State.DECLINED);
    }

    public boolean isDeleted() {
        return this.state.equals(State.DELETED);
    }
    public boolean isOnEdit() {
        return this.state.equals(State.ON_EDIT);
    }
}
