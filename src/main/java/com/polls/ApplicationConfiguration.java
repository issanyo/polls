package com.polls;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.polls.repository.PollEntity;
import com.polls.services.PollService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class ApplicationConfiguration {

    @Bean
    CommandLineRunner loadDataFromJson(PollService pollService) {
        return args -> {
            InputStream inputStream = ApplicationConfiguration.class.getResourceAsStream("polls.json");
            try {
                Collection<PollEntity> polls = new ObjectMapper().readValue(inputStream, new TypeReference<>(){});
                pollService.save(polls);
                log.info("Users inserted");
            } catch (IOException e){
                log.error("Unable to load data from json", e);
            }
        };
    }
}
