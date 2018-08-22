package com.aroussi.blog.config.aware;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("AROUSSI");
        /*
         When we will implement security :
         return ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername();
         */
    }
}
