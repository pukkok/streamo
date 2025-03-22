package watch.movie.domain.video.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import watch.movie.domain.notice.service.NoticeService;

@RestController
@RequiredArgsConstructor
public class VideoController {

    private final NoticeService noticeService;

}
