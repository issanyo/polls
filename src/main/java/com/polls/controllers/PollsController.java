package com.polls.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.polls.dto.Poll;
import com.polls.services.PollService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PollsController {

    private final PollService pollService;

    @RequestMapping("/polls")
    @ResponseStatus(HttpStatus.OK)
    public Collection<Poll> getPolls(@RequestParam(value = "user", required = false) final String user,
                                     @RequestParam(value = "title", required = false) final String title,
                                     @RequestParam(value = "date", required = false) final Long date) {
        if (user != null){
            return pollService.getByUser(user);
        }

        if (title != null){
            return pollService.searchByTitle(title);
        }

        if (date != null){
            return pollService.getFromDate(date);
        }
        return null;
    }
}
