package watch.movie.domain.requireBoard.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class RequireBoardQueryRepository {

    private final JPAQueryFactory query;
}
