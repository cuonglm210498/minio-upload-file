package com.lecuong.miniospringboot.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author CuongLM18
 * @created 10/11/2022 - 3:04 PM
 * @project minio-springboot
 */
@Configuration
public class MapperConfig {
    @Bean
    public ModelMapper getMapper() {
        var mapper = new ModelMapper();
        mapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        return mapper;
    }
}
