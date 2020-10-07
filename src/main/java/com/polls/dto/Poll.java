package com.polls.dto;

import java.util.Collection;

public class Poll {
        String id;
        String adminKey;
        Long latestChange;
        Long initiated;
        Long participantsCount;
        Long inviteesCount;
        String type;
        boolean hidden;
        String preferencesType;
        String state;
        String locale;
        String title;
        User initiator;
        Collection<Option> options;
        String optionsHash;
        Collection<Participant> participants;
        Collection<String> invitees;
        String device;
        String levels;
}
