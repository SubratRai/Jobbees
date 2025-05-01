// package com.jobbees.config; bana lena

package com.jobbees.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
        return http.build();
    }
    // PasswordEncoder ek spring bean bnaya hamne
    // taki jab bhi hume password ecode krna ho, hum sidha isko inject krr paye
    @Bean
    public PasswordEncoder passwordEncoder() {
        //BCryptPassword ek strong hashing algorithm hai
        //jo password ko encrypt krta hai
        return new BCryptPasswordEncoder();
    }
}
