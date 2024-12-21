package yoon.notice_boardPractice;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Size;

public class PostDTO {
    @Size(min = 2, max = 8, message = "닉네임은 2 ~ 8자")
    private String userNickName;
    @Size(min = 1, max = 30)
    private String title;
    @Size(min = 1, max = 1000)
    private String detail;



    public PostDTO() {
    }

    public PostDTO(String userNickName, String title, String detail) {
        this.userNickName = userNickName;
        this.title = title;
        this.detail = detail;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public String getTitle() {
        return title;
    }

    public String getDetail() {
        return detail;
    }
}
