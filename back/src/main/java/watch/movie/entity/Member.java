package watch.movie.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Persistable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import watch.movie.base.RoleCode;
import watch.movie.entity.base.BaseEntity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseEntity implements UserDetails, Persistable<String> {

    @Id
    @Column(name = "member_id")
    private String id;
    private String name;
    private String password;
    private String birthday;

    @Enumerated(EnumType.STRING)
    private RoleCode role;

    public Member(String id, String name, String password, String birthday, RoleCode role) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.birthday = birthday;
        this.role = role;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority(role.toString()));
        return roles;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.id;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean isNew() {
        return createDate == null;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public void changeRole(RoleCode role) {
        this.role = role;
    }

}
