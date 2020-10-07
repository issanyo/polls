package com.polls.controllers;

import java.time.Instant;
import java.util.Collection;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.polls.dto.Poll;
import com.polls.repository.PollRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class PollsControllerTest {

    @Autowired
    private PollsController pollsController;

    @Autowired
    private PollRepository pollRepository;

    @Test
    void getPollsByUserId() {
        final Collection<Poll> polls = pollsController.getPolls("mh+sample@doodle.com", null, null);
        assertTrue(polls.size() > 0);
        final Poll poll = polls.iterator().next();
        assertEquals("xsd4cv89t5f5um4b", poll.getId());
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