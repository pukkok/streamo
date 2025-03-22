package watch.movie.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import watch.movie.entity.base.BaseEntity;

@Entity
@Getter
@Table(name = "required_board")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RequireBoard extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "required_board_seq")
    @SequenceGenerator(name = "required_board_seq",
            sequenceName = "REQUIRED_BOARD_SEQUENCE"
    )
    @Column(name = "require_board_id")
    private Long id;
    private String title;
    private String content;
    private Long view;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(name = "delete_yn")
    private Character deleteYn;

    public void changeTitle(String title) {
        this.title = title;
    }

    public void changeContent(String content) {
        this.content = content;
    }

    public void viewCountUp() {
        this.view += 1;
    }
}
