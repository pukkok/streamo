package watch.movie.domain.requireBoard.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import watch.movie.domain.notice.service.NoticeService;

@RestController
@RequiredArgsConstructor
public class RequireBoardController {

    private final NoticeService noticeService;

}
