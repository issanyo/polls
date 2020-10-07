package com.polls.controllers;

import java.util.Collection;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollsController {

    @RequestMapping("/polls")
    @ResponseStatus(HttpStatus.OK)
    public Collection<String> getPolls() {
        return null;
    }
}
