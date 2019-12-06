package com.buzzle.springboot.repository;

import com.buzzle.springboot.entity.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {
}
