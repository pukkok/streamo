package watch.movie.domain.notice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import watch.movie.entity.Member;

public interface NoticeJpaRepository extends JpaRepository<Member, Long> {

}
