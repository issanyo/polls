package com.polls.controllers;

import java.time.Instant;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
class PollsControllerTest {

    @Autowired
    private PollsController pollsController;

    @Test
    void getPollsByUserId() {
        assertNotNull(pollsController.getPolls(1L, null, null));
    }

    @Test
    void getPollsByTitle() {
        assertNotNull(pollsController.getPolls(null, "title", null));
    }

    @Test
    void getPollsAfterDate() {
        assertNotNull(pollsController.getPolls(null, null, Date.from(Instant.now())));
    }
}