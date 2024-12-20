package yoon.notice_boardPractice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class NoticeBoard {

    @Id
    private Long id;

    private String title;

    @OneToMany(mappedBy = "board")
    private List<Post> posts;

}
