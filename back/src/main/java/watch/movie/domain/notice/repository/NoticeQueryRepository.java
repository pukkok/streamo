package watch.movie.domain.notice.repository;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import watch.movie.domain.notice.dto.NoticeDto;
import watch.movie.domain.notice.dto.cond.NoticeSearchCond;

import java.util.List;

import static watch.movie.entity.QNotice.notice;

@Repository
@RequiredArgsConstructor
public class NoticeQueryRepository {

    private final JPAQueryFactory query;

    public List<NoticeDto> findAll(NoticeSearchCond cond, Pageable pageable) {
        return query
                .selectFrom(notice)
                .where(
                        likeTitle(cond),
                        likeContent(cond),
                        likeAuthor(cond)
                )
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch()
                .stream()
                .map(NoticeDto::new).toList();
    }


    /**
     * 검색 조건 함수
     */
    private BooleanExpression likeTitle(NoticeSearchCond cond) {
        return notice.title.like("%" + cond.getTitle() + "%");
    }

    private BooleanExpression likeContent(NoticeSearchCond cond) {
        return notice.content.like("%" + cond.getContent() + "%");
    }

    private BooleanExpression likeAuthor(NoticeSearchCond cond) {
        return notice.createBy.like("%" + cond.getAuthor() + "%");
    }
}