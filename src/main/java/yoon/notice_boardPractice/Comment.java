package yoon.notice_boardPractice;

import jakarta.persistence.*;

@Entity
public class Comment {

    @Id
    private Long id;

    private String detail;

    @ManyToOne
    private Post post;

}
