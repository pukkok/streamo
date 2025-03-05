package watch.movie.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import watch.movie.entity.base.BaseTimeEntity;

@Entity
@Getter
@Table(name = "required_board")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RequireBoard extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "required_board_seq")
    @SequenceGenerator(name = "required_board_seq",
            allocationSize = 50,
            sequenceName = "REQUIRED_BOARD_SEQUENCE"
    )
    private Long id;
    private String title;
    private String content;
    private Integer view;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

}
