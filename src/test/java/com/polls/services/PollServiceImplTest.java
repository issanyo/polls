package com.polls.services;

import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import com.polls.repository.PollEntity;
import com.polls.repository.PollRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PollServiceImplTest {

    @Mock
    private PollRepository pollRepository;

    private ModelMapper modelMapper = new ModelMapper();

    private PollService pollService;

    @BeforeEach
    void setUp() {
        pollService = new PollServiceImpl(pollRepository, modelMapper);
    }

    @Test
    void getPollsByExistentUser() {
        when(pollRepository.findAllByInitiatorEmail(anyString())).thenReturn(Collections.singletonList(new PollEntity()));
        assertEquals(1, pollService.getByUser("x").size());
    }

    @Test
    void getPollsByNonExistentUser() {
        assertEquals(0, pollService.getByUser("x").size());
    }

    @Test
    void getPollsByTitleLikeExistent() {
        when(pollRepository.findAllByTitleContainingIgnoreCase(anyString())).thenReturn(Collections.singletonList(new PollEntity()));
        assertEquals(1, pollService.searchByTitle("t").size());
    }

    @Test
    void getPollsByTitleLikeNonExistent() {
        assertEquals(0, pollService.searchByTitle("t").size());
    }
}