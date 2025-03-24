package watch.movie.domain.notice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import watch.movie.base.StatusCode;
import watch.movie.domain.notice.dto.NoticeDto;
import watch.movie.domain.notice.dto.cond.NoticeSearchCond;
import watch.movie.domain.notice.repository.NoticeJpaRepository;
import watch.movie.domain.notice.repository.NoticeQueryRepository;
import watch.movie.entity.Notice;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class NoticeService {

    private final NoticeJpaRepository jpaRepository;
    private final NoticeQueryRepository queryRepository;

    public List<NoticeDto> findAll(NoticeSearchCond cond, Pageable pageable) {
        return queryRepository.findAll(cond, pageable);
    }

    @Transactional
    public NoticeDto findById(Long id) {
        Notice findNotice = jpaRepository.findById(id).orElse(null);
        findNotice.viewCountUp();

        return new NoticeDto(findNotice);
    }

    public void updateNotice(Long id, NoticeDto notice) {
        Notice findNotice = jpaRepository.findById(id).get();

        findNotice.changeTitle(notice);
        findNotice.changeContent(notice);
    }

    public void save(NoticeDto notice) {
        Notice saveNotice = Notice.of(notice.getTitle(), notice.getContent(), 0L);
        jpaRepository.save(saveNotice);
    }
}
