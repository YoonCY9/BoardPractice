package yoon.notice_boardPractice;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class NoticeBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;  // 게시판 제목

    @OneToMany(mappedBy = "board")  // 게시판 하나와 많은 게시글
    private List<Post> posts;

    public String getTitle() {
        return title;
    }

    public NoticeBoard(String title) {
        this.title = title;
    }
}
