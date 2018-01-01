package com.hiepthanh.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hiepthanh.model.Messages;

@Repository
public interface MessageRepository extends CrudRepository<Messages, Integer> {

}
