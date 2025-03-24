package watch.movie.domain.notice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import watch.movie.base.StatusCode;
import watch.movie.domain.notice.dto.NoticeDto;
import watch.movie.domain.notice.dto.cond.NoticeSearchCond;
import watch.movie.domain.notice.service.NoticeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NoticeController {

    private final NoticeService noticeService;

    @GetMapping("/notice")
    public List<NoticeDto> allNotice(@ModelAttribute NoticeSearchCond cond, Pageable pageable) {
        return noticeService.findAll(cond, pageable);
    }

    @PostMapping("/notice")
    public StatusCode saveNotice(@RequestBody NoticeDto notice) {
        noticeService.save(notice);
        return StatusCode.SUCCESS;
    }

    @GetMapping("/notice/{id}")
    public NoticeDto getNotice(@PathVariable("id") Long id) {
        return noticeService.findById(id);
    }

    @PostMapping("/notice/{id}")
    public StatusCode updateNotice(@PathVariable("id") Long id, @RequestBody NoticeDto notice) {
        noticeService.updateNotice(id, notice);
        return StatusCode.SUCCESS;
    }

}
