package watch.movie.domain.video.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import watch.movie.domain.notice.repository.NoticeJpaRepository;
import watch.movie.domain.notice.repository.NoticeQueryRepository;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class VideoService {

    private final NoticeJpaRepository jpaRepository;
    private final NoticeQueryRepository queryRepository;

}
