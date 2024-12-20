package yoon.notice_boardPractice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class CommentTest {

    @Autowired
    CommentRepository repository;

//    @Test
//    void CreateCommentTest() {
//        Comment comment = new Comment("안녕하세요",null);
//
//        repository.save(comment);
//
//        assertThat(comment.getId()).isNotNull();
//
//    }
}
