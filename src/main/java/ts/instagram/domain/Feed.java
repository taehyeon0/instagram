package ts.instagram.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Feed {
    private int feed_id;
    private String content;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;

    /*
    public feed(int feed_id, String content, LocalDateTime createdAt, String createdBy, LocalDateTime modifiedAt, String modifiedBy) {
        this.feed_id = feed_id;
        this.content = content;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.modifiedAt = modifiedAt;
        this.modifiedBy = modifiedBy;
    }
    */

    /* TODO
    protected feed() {
    }

    private feed(String content) {
        this.content = content;
    }
     */
}
