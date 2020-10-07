package com.polls.repository;

import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<PollEntity, String> {
}
