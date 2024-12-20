package yoon.notice_boardPractice;

import jakarta.validation.constraints.Size;

public class NoticeBoardDTO {

    @Size(min = 2 , max = 12 , message = "2 ~ 12 자 사이로 입력해주세요")
    private String title;

    public NoticeBoardDTO() {
    }

    public NoticeBoardDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
