package ts.instagram.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Feed {
    private int feedId;
    private int userId;
    private String content;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;

    public Feed(int feedId, int userId, String content, LocalDateTime createdAt, String createdBy, LocalDateTime modifiedAt, String modifiedBy) {
        this.feedId = feedId;
        this.userId = userId;
        this.content = content;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.modifiedAt = modifiedAt;
        this.modifiedBy = modifiedBy;
    }
}
