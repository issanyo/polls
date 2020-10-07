package com.polls.controllers;

import java.util.Collection;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollsController {

    @RequestMapping("/polls")
    @ResponseStatus(HttpStatus.OK)
    public Collection<String> getPolls(@RequestParam(value = "userId", required = false) final Long userId,
                                       @RequestParam(value = "title", required = false) final String title,
                                       @RequestParam(value = "date", required = false) final Date date) {
        return null;
    }
}
