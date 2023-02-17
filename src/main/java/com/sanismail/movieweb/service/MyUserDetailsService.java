package com.sanismail.movieweb.service;
/*
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanismail.movieweb.model.entity.Privilege;
import com.sanismail.movieweb.model.entity.Role;
import com.sanismail.movieweb.model.entity.User;
import com.sanismail.movieweb.repository.RoleRepository;
import com.sanismail.movieweb.repository.UserRepository;
*/
//@Service("userDetailsService")
//@Transactional
public class MyUserDetailsService {
    /*

        implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private IUserService service;

    @Autowired
    private MessageSource messages;

    @Autowired
    private RoleRepository roleRepository;



    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            return new org.springframework.security.core.userdetails.User(
                    " ", " ", true, true, true, true,
                    getAuthorities(Set.of(roleRepository.findByName("ROLE_USER"))));
        }

        return new org.springframework.security.core.userdetails.User(
                user.getEmail(), user.getPassword(), true, true, true,
                true, getAuthorities(user.getRoles()));
    }

    private Set<? extends GrantedAuthority> getAuthorities(Set<Role> roles) {
        return getGrantedAuthorities(getPrivileges(roles));
    }

    private Set<String> getPrivileges(Set<Role> roles) {
        Set<String> privileges = new HashSet<>();
        Set<Privilege> collection = new HashSet<>();
        for (Role role : roles) {
            privileges.add(role.getName());
            collection.addAll(role.getPrivileges());
        }
        for (Privilege item : collection) {
            privileges.add(item.getName());
        }
        return privileges;
    }

    private Set<GrantedAuthority> getGrantedAuthorities(Set<String> privileges) {
        Set<GrantedAuthority> authorities = new HashSet<>();
        for (String privilege : privileges) {
            authorities.add(new SimpleGrantedAuthority(privilege));
        }
        return authorities;
    }

     */
}
