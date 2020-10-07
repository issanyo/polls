package com.polls.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polls.repository.PollEntity;
import com.polls.repository.PollRepository;

@Service
public class PollServiceImpl implements PollService{

    @Autowired
    PollRepository pollRepository;

    public void save(Collection<PollEntity> polls){
        pollRepository.saveAll(polls);
    }
}
