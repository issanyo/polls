package com.polls.repository;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class UserEntity {
    @Id
    private String email;
    private String name;
    private boolean notify;
    private String timeZone;
}
