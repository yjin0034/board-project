package com.projectboard.boardproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@EnableJpaAuditing
@Configuration
public class JpaConfig {

    @Bean
    public AuditorAware<String> audiotrAware() {
        return () -> Optional.of("yjin0034"); // TODO: 스프링 시큐리티로 인증 기능 붙일 때, 수정하자
    }
}
