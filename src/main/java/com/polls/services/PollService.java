package com.polls.services;

import java.util.Collection;

import com.polls.repository.PollEntity;

public interface PollService {
    void save(Collection<PollEntity> users);
}
