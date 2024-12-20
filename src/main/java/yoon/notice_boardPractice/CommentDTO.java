package yoon.notice_boardPractice;

import jakarta.validation.constraints.Size;

public class CommentDTO {

    @Size(min = 1, max =  50, message = "1 ~ 50자로 입력해주세요")
    private String detail;

    private Post post;

    public CommentDTO() {
    }

    public CommentDTO(String detail, Post post) {
        this.detail = detail;
        this.post = post;
    }

    public String getDetail() {
        return detail;
    }

    public Post getPost() {
        return post;
    }
}