package yoon.notice_boardPractice.comment;

import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepository repository;

    public CommentService(CommentRepository repository) {
        this.repository = repository;
    }

    public void createComment(CommentDTO dto) {
        Comment comment = new Comment(dto.getDetail(), dto.getPost());
    }
}
