package com.polls.services;

import java.util.Collection;

import com.polls.dto.Poll;
import com.polls.repository.PollEntity;

public interface PollService {

    void save(Collection<PollEntity> users);
    Collection<Poll> getByUser(String user);
}
