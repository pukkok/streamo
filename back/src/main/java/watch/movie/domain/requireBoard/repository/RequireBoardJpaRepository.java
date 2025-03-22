package watch.movie.domain.requireBoard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import watch.movie.entity.Member;

public interface RequireBoardJpaRepository extends JpaRepository<Member, Long> {

}
