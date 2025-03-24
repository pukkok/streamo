package watch.movie.domain.notice.dto;

import lombok.Data;
import watch.movie.entity.Notice;

import java.time.LocalDateTime;

@Data
public class NoticeDto {

    private String title;
    private String author;
    private String content;
    private Long view;
    private LocalDateTime registDate;

    public NoticeDto(Notice notice) {
        this.title = notice.getTitle();
        this.author = notice.getCreateBy();
        this.content = notice.getContent();
        this.view = notice.getView();
        this.registDate = notice.getCreateDate();
    }
}
