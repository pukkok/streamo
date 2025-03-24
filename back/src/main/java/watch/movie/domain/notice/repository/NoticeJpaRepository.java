package watch.movie.domain.notice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import watch.movie.entity.Notice;

public interface NoticeJpaRepository extends JpaRepository<Notice, Long> {

}
