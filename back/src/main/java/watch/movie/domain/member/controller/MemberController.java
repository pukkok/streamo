package watch.movie.domain.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.*;
import watch.movie.base.AgeRatingCode;
import watch.movie.base.RoleCode;
import watch.movie.base.StatusCode;
import watch.movie.domain.member.dto.MemberDto;
import watch.movie.domain.member.service.MemberService;
import watch.movie.entity.Member;
import watch.movie.entity.Notice;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/members")
    public List<MemberDto> allMember() {
        return memberService.findAll();
    }

    @PostMapping("/member/join")
    public StatusCode join(@ModelAttribute MemberDto dto) {
        try {
            memberService.join(dto);
        } catch (DuplicateKeyException e) {
            return StatusCode.DUPLICATED_ID;
        }
        return StatusCode.SUCCESS;
    }

    @PostMapping("/member/role/{memberId}")
    public StatusCode updateRole(@PathVariable("memberId") String memberId, @RequestBody RoleCode role) {
        memberService.updateRole(memberId, role);
        return StatusCode.SUCCESS;
    }

}
