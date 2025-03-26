package watch.movie.domain.member.service;

import lombok.RequiredArgsConstructor;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import watch.movie.base.RoleCode;
import watch.movie.domain.member.dto.MemberDto;
import watch.movie.domain.member.repository.MemberJpaRepository;
import watch.movie.domain.member.repository.MemberQueryRepository;
import watch.movie.entity.Member;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberJpaRepository jpaRepository;
    private final MemberQueryRepository queryRepository;

    @Transactional
    public void join(MemberDto dto) {
        Member findMember = jpaRepository.findById(dto.getId());

        if (findMember != null) {
            throw new DuplicateKeyException("중복 아이디 발견");
        }

        Member saveMember = Member.of(dto.getId(), dto.getName(), dto.getPassword(), dto.getBirthday());

        jpaRepository.save(saveMember);
    }

    @Transactional
    public void updateRole(String memberId, RoleCode role) {
        Member findMember = jpaRepository.findById(memberId);
        findMember.changeRole(role);
    }

    public List<MemberDto> findAll() {
        return jpaRepository.findAll().stream().map(MemberDto::new).toList();
    }

}
