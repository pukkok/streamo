package watch.movie.domain.notice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import watch.movie.domain.notice.service.NoticeService;

@RestController
@RequiredArgsConstructor
public class NoticeController {

    private final NoticeService noticeService;

}
