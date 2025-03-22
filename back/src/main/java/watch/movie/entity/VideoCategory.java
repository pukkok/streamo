package watch.movie.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import watch.movie.entity.base.BaseEntity;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "video_category")
public class VideoCategory extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "video_category_id")
    private Long id;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private VideoCategory parent;

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private List<Video> videos = new ArrayList<>();

    @Column(name = "delete_yn")
    private Character deleteYn;
}
