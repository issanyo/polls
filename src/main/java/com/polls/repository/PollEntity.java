package com.polls.repository;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class PollEntity {
    @Id
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
    @Column(length = 2000)
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private UserEntity initiator;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    private Collection<OptionEntity> options = new ArrayList<>();

    private String optionsHash;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    private Collection<ParticipantEntity> participants = new ArrayList<>();

    @Embedded
    private Collection<String> invitees = new ArrayList<>();
    private String device;
    private String levels;
}
