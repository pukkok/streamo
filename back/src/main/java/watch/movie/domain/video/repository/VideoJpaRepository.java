package watch.movie.domain.video.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import watch.movie.entity.Member;

public interface VideoJpaRepository extends JpaRepository<Member, Long> {

}
