package watch.movie.domain.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import watch.movie.entity.Member;

public interface MemberJpaRepository extends JpaRepository<Member, Long> {

    Member findById(String id);
}
