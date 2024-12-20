package yoon.notice_boardPractice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class User {

    private Long id;
    private String userId;
    private String passWord;
    private String eMail;
    private String nickName;
    private String birthDate;
    private Integer phoneNumber;


}
