package yoon.notice_boardPractice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Post {

    @Id
    private Long id;

    private String userNickName;

    private String title;

    private String detail;

    private Integer views;

    @OneToMany(mappedBy = "post")
    private List<Comment> comments;

    @ManyToOne
    private NoticeBoard board;





}
