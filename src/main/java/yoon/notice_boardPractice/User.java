package yoon.notice_boardPractice;

import java.time.LocalDateTime;

public class User {

    private String userId;
    private String passWord;
    private String eMail;
    private String nickName;
    private String birthDate;
    private Integer phoneNumber;

    public User(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getUserId() {
        return userId;
    }
}
