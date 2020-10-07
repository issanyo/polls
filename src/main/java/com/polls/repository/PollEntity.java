package com.polls.repository;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.polls.dto.Option;
import com.polls.dto.Participant;
import com.polls.dto.User;

import lombok.Data;

@Data
@Entity
public class PollEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private String id;
    private String adminKey;
    private Long latestChange;
    private Long initiated;
    private Long participantsCount;
    private Long inviteesCount;
    private String type;
    private boolean hidden;
    private String preferencesType;
    private String state;
    private String locale;
    private String title;
    private User initiator;
    private Collection<Option> options;
    private String optionsHash;
    private Collection<Participant> participants;
    private Collection<String> invitees;
    private String device;
    private String levels;
}
