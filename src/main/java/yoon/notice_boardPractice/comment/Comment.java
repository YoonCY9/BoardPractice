package yoon.notice_boardPractice.comment;

import jakarta.persistence.*;
import yoon.notice_boardPractice.post.Post;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String detail; // 댓글 내용

    @ManyToOne
    private Post post;

    public Comment(String detail, Post post) {
        this.detail = detail;
        this.post = post;
    }

    public Long getId() {
        return id;
    }

    public String getDetail() {
        return detail;
    }

    public Post getPost() {
        return post;
    }
}
