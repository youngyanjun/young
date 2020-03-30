package com.young.config;

import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author youngyanjun
 * @date 2020-03-23 18:33
 * 日期格式类LocalDateTime 去除 日期和时间中间的 "T"
 */
@Configuration
public class LocalDateTimeSerializerConfig {



        @org.springframework.beans.factory.annotation.Value("${spring.jackson.date-format:yyyy-MM-dd HH:mm:ss}")
        private String pattern;

        @Bean
        public LocalDateTimeSerializer localDateTimeDeserializer() {
            return new LocalDateTimeSerializer(DateTimeFormatter.ofPattern(pattern));
        }

        @Bean
        public Jackson2ObjectMapperBuilderCustomizer jackson2ObjectMapperBuilderCustomizer() {
            return builder -> builder.serializerByType(LocalDateTime.class, localDateTimeDeserializer());
        }



}
