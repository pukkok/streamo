package watch.movie.entity.base;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MenuEntity extends BaseEntity{

    @Id @GeneratedValue
    @Column(name = "menu_id")
    private Long id;
    private Integer priority;
    private String name;
    private String role;
    private String path;

}
