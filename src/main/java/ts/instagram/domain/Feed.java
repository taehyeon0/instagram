package ts.instagram.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Feed {
    private int feed_id;
    private int user_id;
    private String content;
    private LocalDateTime created_at;
    private String created_by;
    private LocalDateTime modified_at;
    private String modified_by;
}
