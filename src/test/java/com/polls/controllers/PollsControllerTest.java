package com.polls.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class PollsControllerTest {

    @Autowired
    private PollsController pollsController;

    @Test
    void getPolls() {
        pollsController.getPolls();
    }
}