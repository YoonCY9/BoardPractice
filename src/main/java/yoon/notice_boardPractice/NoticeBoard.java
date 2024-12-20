package yoon.notice_boardPractice;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class NoticeBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToMany(mappedBy = "board")
    private List<Post> posts;

    public String getTitle() {
        return title;
    }

    public NoticeBoard(String title) {
        this.title = title;
    }
}
