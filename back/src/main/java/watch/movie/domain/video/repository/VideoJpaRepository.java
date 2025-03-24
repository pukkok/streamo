package watch.movie.domain.video.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import watch.movie.entity.Video;

public interface VideoJpaRepository extends JpaRepository<Video, Long> {

}
