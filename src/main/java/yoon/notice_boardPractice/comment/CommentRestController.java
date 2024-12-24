package yoon.notice_boardPractice.comment;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentRestController {

    private final CommentService commentService;


    public CommentRestController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/comment")
    public void createComment(@Valid @RequestBody CommentDTO comments) {
        commentService.createComment(comments);
    }
}
