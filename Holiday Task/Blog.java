abstract class Person {
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    abstract public void introduce();
}
class Author extends Person {
    private String category;

    public Author(String name, String email, String category){
        super(name, email); 
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public void introduce() {
        System.out.println("Author: " + getName() + ", Category: " + category);
    }

    public void writePost(Post post){
        System.out.println(getName() + " is writing: " + post.getTitle());
    }

    public void publishPost(Post post){
        System.out.println(getName() + " published: " + post.getTitle());
    }
}
class Reader extends Person {
    public Reader(String name, String email){
        super(name, email); 
    }

    @Override
    public void introduce() {
        System.out.println("Reader: " + getName());
    }

    public void readPost(Post post){
        System.out.println(getName() + " is reading: " + post.getTitle());
        System.out.println("Content: " + post.getContent());
    }
}

class Post {
    private String title;
    private String content;
    private Author author;

    public Post(String title, String content, Author author) {
        if (author == null) {
            throw new IllegalArgumentException("Author cannot be null");
        }
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        if (content == null || content.isEmpty()) {
            throw new IllegalArgumentException("Content cannot be empty");
        }
        this.title = title.trim();
        this.content = content.trim();
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Author getAuthor() {
        return author;
    }
}
class Comment {
    private String commentText;
    private Reader commenter;
    private Post post;

    public Comment(String commentText, Reader commenter, Post post) {
        if (commenter == null) {
            throw new IllegalArgumentException("Commenter cannot be null");
        }
        if (post == null) {
            throw new IllegalArgumentException("Post cannot be null");
        }
        if (commentText == null || commentText.trim().isEmpty()) {
            throw new IllegalArgumentException("Comment cannot be empty");
        }
        if (commentText.length() > 500) {
            throw new IllegalArgumentException("Comment cannot exceed 500 characters");
        }
        this.commentText = commentText.trim();
        this.commenter = commenter;
        this.post = post;
    }

    public String getCommentText() {
        return commentText;
    }

    public Reader getCommenter() {
        return commenter;
    }

    public Post getPost() {
        return post;
    }

    public void display() {
        System.out.println("--- Comment ---");
        System.out.println("By: " + commenter.getName());
        System.out.println("On Post: " + post.getTitle());
        System.out.println("Comment: " + commentText);
        System.out.println("---------------");
    }
}

class Blog {
    public static void main(String[] args) {
        System.out.println("=== Blog System Test Cases ===\n");

        System.out.println("Creating users...");
        Author author = new Author("John", "john@gmail.com", "Technology");
        Reader reader = new Reader("Alice", "alice@example.com");
        author.introduce();
        reader.introduce();
        System.out.println();

        System.out.println("Creating valid post...");
        Post post1 = new Post("Java Basics", "Learn Java fundamentals here.", author);
        System.out.println("Post created: " + post1.getTitle());
        System.out.println();

        System.out.println("Reader reads post...");
        reader.readPost(post1);
        System.out.println();

        System.out.println("Comment feature...");
        Comment comment = new Comment("Great article! Very helpful for beginners.", reader, post1);
        comment.display();
        System.out.println();

        System.out.println("Error handling - Empty title.");
        try {
            Post invalidPost = new Post("", "Some content", author);
            System.out.println("ERROR: Should have thrown exception!");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
        System.out.println();

        System.out.println("Error handling - Null author.");
        try {
            Post invalidPost = new Post("Test", "Content", null);
            System.out.println("ERROR: Should have thrown exception!");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
        System.out.println();

        System.out.println("Error handling - Empty comment.");
        try {
            Comment invalidComment = new Comment("   ", reader, post1);
            System.out.println("ERROR: Should have thrown exception!");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
        System.out.println();

        System.out.println("Author functionality...");
        author.writePost(post1);
        author.publishPost(post1);
        System.out.println();

        System.out.println("Multiple comments...");
        Comment comment2 = new Comment("Thanks for sharing this tutorial!", reader, post1);
        Comment comment3 = new Comment("Can you share more examples?", reader, post1);
        comment2.display();
        comment3.display();
    }
}
