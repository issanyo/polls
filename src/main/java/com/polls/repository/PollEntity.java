package com.polls.repository;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
    @ManyToOne
    private UserEntity initiator;
    @OneToMany
    private Collection<OptionEntity> options;
    private String optionsHash;
    @OneToMany
    private Collection<ParticipantEntity> participants;
    private String device;
    private String levels;
}
