package watch.movie.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import watch.movie.domain.notice.dto.NoticeDto;
import watch.movie.entity.base.BaseEntity;

@Entity
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Notice extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "notice_seq")
    @SequenceGenerator(name = "notice_seq",
            sequenceName = "NOTICE_SEQUENCE"
    )
    @Column(name = "notice_id")
    private Long id;
    private String title;
    private String content;
    private Long view;

    @Column(name = "delete_yn")
    private Character deleteYn;

    public static Notice of(String title, String content, Long view) {
        Notice notice = new Notice();
        notice.setTitle(title);
        notice.setContent(content);
        notice.setView(view);
        return notice;
    }

    public void viewCountUp() {
        this.view += 1;
    }

    public void changeTitle(NoticeDto notice) {
        this.title = notice.getTitle();
    }

    public void changeContent(NoticeDto notice) {
        this.content = notice.getContent();
    }
}
