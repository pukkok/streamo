package watch.movie.security;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import watch.movie.domain.member.repository.MemberJpaRepository;
import watch.movie.entity.Member;

@Service
@RequiredArgsConstructor
public class ProfileUserDetailService implements UserDetailsService {

    @Autowired
    private MemberJpaRepository memberJpaRepository;

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        Member member = memberJpaRepository.findById(id);
        if(member == null){
            throw new UsernameNotFoundException("user not found");
        }

        return member;
    }
}
