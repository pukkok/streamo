package watch.movie.domain.notice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import watch.movie.domain.notice.dto.NoticeDto;
import watch.movie.domain.notice.dto.cond.NoticeSearchCond;
import watch.movie.domain.notice.repository.NoticeJpaRepository;
import watch.movie.domain.notice.repository.NoticeQueryRepository;
import watch.movie.entity.Notice;
import watch.movie.utility.ItemCheck;

import java.rmi.NoSuchObjectException;
import java.util.List;

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
    public NoticeDto findById(Long id) throws NoSuchObjectException {
        Notice findNotice = jpaRepository.findById(id).orElse(null);
        if (ItemCheck.isNotEmpty(findNotice)) {
            findNotice.viewCountUp();
        } else {
            throw new NoSuchObjectException("게시글이 존재하지 않습니다.");
        }

        return new NoticeDto(findNotice);
    }

    public void updateNotice(Long id, NoticeDto notice) throws NoSuchObjectException{
        Notice findNotice = jpaRepository.findById(id).orElse(null);

        if (ItemCheck.isNotEmpty(findNotice)) {
            findNotice.changeTitle(notice);
            findNotice.changeContent(notice);
        } else {
            throw new NoSuchObjectException("게시글이 존재하지 않습니다.");
        }
    }

    public void save(NoticeDto notice) {
        Notice saveNotice = Notice.of(notice.getTitle(), notice.getContent());
        jpaRepository.save(saveNotice);
    }
}
