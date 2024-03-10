package ts.instagram.domain;

import lombok.Data;

import java.sql.Date;

@Data
public class Instauser {
    /*public int user_Id;
    public String user_nickname;
    public String password;
    public String name;
    public String phone;
    public String content;
    public Date created_at;
    public String created_by;
    public Date modified_at;
    public String modified_by;*/

    private int userId;
    private String userNickname;
    private String password;
    private String name;
    private String phone;
    private String content;
    private Date createdAt;
    private String createdBy;
    private Date modifiedAt;
    private String modifiedBy;

    public Instauser(int userId, String userNickname, String password, String name, String phone, String content, Date createdAt, String createdBy, Date modifiedAt, String modifiedBy) {
        this.userId = userId;
        this.userNickname = userNickname;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.content = content;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.modifiedAt = modifiedAt;
        this.modifiedBy = modifiedBy;
    }
}
