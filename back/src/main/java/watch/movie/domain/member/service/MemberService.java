package watch.movie.domain.member.service;

import lombok.RequiredArgsConstructor;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import watch.movie.base.RoleCode;
import watch.movie.domain.member.dto.MemberDto;
import watch.movie.domain.member.repository.MemberJpaRepository;
import watch.movie.domain.member.repository.MemberQueryRepository;
import watch.movie.entity.Member;
import watch.movie.utility.ItemCheck;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberJpaRepository jpaRepository;
    private final MemberQueryRepository queryRepository;

    @Transactional
    public void join(MemberDto dto) {
        Member findMember = jpaRepository.findById(dto.getId()).orElse(null);

        if (!ItemCheck.isNotEmpty(findMember)) {
            throw new DuplicateKeyException("중복 아이디 발견");
        }

        Member saveMember = Member.of(dto.getId(), dto.getName(), dto.getPassword(), dto.getBirthday());

        jpaRepository.save(saveMember);
    }

    @Transactional
    public void updateRole(String memberId, RoleCode role) {
        Member findMember = jpaRepository.findById(memberId).orElse(null);

        if (!ItemCheck.isNotEmpty(findMember)) {
            findMember.changeRole(role);
        } else {
            throw new UsernameNotFoundException("사용자가 존재하지 않습니다.");
        }
    }

    public List<MemberDto> findAll() {
        return jpaRepository.findAll().stream().map(MemberDto::new).toList();
    }

}
