package yoon.notice_boardPractice.post;

import jakarta.persistence.*;
import yoon.notice_boardPractice.board.NoticeBoard;
import yoon.notice_boardPractice.comment.Comment;

import java.util.List;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userNickName;

    private String title;

    private String detail;


    @OneToMany(mappedBy = "post")
    private List<Comment> comments;

    @ManyToOne
    private NoticeBoard board;

    public Post() {
    }

    public Post(String userNickName, String title, String detail) {
        this.userNickName = userNickName;
        this.title = title;
        this.detail = detail;
    }
}
