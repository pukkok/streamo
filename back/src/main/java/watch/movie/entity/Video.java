package watch.movie.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import watch.movie.base.AgeRatingCode;
import watch.movie.entity.base.BaseEntity;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Video extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "video_id")
    private Long id;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private VideoCategory category;

    @Enumerated(EnumType.STRING)
    @Column(name = "age_rating")
    private AgeRatingCode ageRating;

    private Long view;
    @Column(name = "poster_path")
    private String posterPath;
    @Column(name = "file_path")
    private String filePath;

    @Column(name = "delete_yn")
    private Character deleteYn;
}
