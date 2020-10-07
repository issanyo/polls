package com.polls.services;

import java.util.Collection;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polls.dto.Poll;
import com.polls.repository.PollEntity;
import com.polls.repository.PollRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PollServiceImpl implements PollService{

    private final PollRepository pollRepository;
    private final ModelMapper modelMapper;

    public void save(Collection<PollEntity> polls){
        pollRepository.saveAll(polls);
    }

    @Transactional
    public Collection<Poll> getByUser(String user) {
        return pollRepository.findAllByInitiatorEmail(user)
                                .stream()
                                .map((accountEntity) -> modelMapper.map(accountEntity, Poll.class))
                                .collect(Collectors.toList());
    }

    @Transactional
    public Collection<Poll> searchByTitle(String title) {
        return pollRepository.findAllByTitleContainingIgnoreCase(title)
                             .stream()
                             .map((accountEntity) -> modelMapper.map(accountEntity, Poll.class))
                             .collect(Collectors.toList());
    }
}
