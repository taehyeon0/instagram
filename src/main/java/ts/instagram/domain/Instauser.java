package ts.instagram.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Instauser {
    /*public int user_Id;
    public String user_nickname;
    public String password;
    public String name;
    public String phone;
    public String content;
    public LocalDateTime created_at;
    public String created_by;
    public LocalDateTime modified_at;
    public String modified_by;*/

    private int userId;
    private String userNickname;
    private String password;
    private String email;
    private String name;
    private String phone;
    private String content;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;

    public Instauser(int userId, String userNickname, String password,String email ,String name, String phone, String content, LocalDateTime createdAt, String createdBy, LocalDateTime modifiedAt, String modifiedBy) {
        this.userId = userId;
        this.userNickname = userNickname;
        this.password = password;
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.content = content;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.modifiedAt = modifiedAt;
        this.modifiedBy = modifiedBy;
    }
}
