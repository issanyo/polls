package com.polls.repository;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<PollEntity, String> {
    Collection<PollEntity> findAllByInitiatorEmail(String initiatorEmail);
    Collection<PollEntity> findAllByTitleContainingIgnoreCase(String title);
}
