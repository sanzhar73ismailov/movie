package com.sanismail.movieweb;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;

//@Configuration
public class BasicAuthWebSecurityConfiguration {
    /*
    //@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                .authorizeRequests().anyRequest().authenticated()
//                .and()
//                .httpBasic();
//
//        return http.build();

        http
                .csrf().disable()
                .authorizeRequests()
                .requestMatchers("/actor/**").authenticated()
                .and()
                .httpBasic();
        return http.build();
    }

    //@Bean
    public InMemoryUserDetailsManager userDetailsServiceNew() {
        UserDetails user = User
                .withUsername("user")
                .password("{noop}password")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user);
    }

     */
}
