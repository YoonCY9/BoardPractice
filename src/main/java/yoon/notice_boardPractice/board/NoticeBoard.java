package yoon.notice_boardPractice.board;

import jakarta.persistence.*;
import yoon.notice_boardPractice.post.Post;

import java.util.List;

@Entity
public class NoticeBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;  // 게시판 이름


    @OneToMany(mappedBy = "board")  // 게시판 하나와 많은 게시글
    private List<Post> posts;

    public NoticeBoard() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public NoticeBoard(String title) {
        this.title = title;
    }
}
