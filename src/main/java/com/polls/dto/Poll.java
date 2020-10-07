package com.polls.dto;

import java.util.Collection;

import lombok.Data;

@Data
public class Poll {
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
    private String description;
    private User initiator;
    private Collection<Option> options;
    private String optionsHash;
    private Collection<Participant> participants;
    private Collection<String> invitees;
    private String device;
    private String levels;
}
