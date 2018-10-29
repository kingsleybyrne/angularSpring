package com.kingsley.dataservice.repository;

import com.kingsley.dataservice.dbmodel.orm.Topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicRepository extends CrudRepository<Topic, Long>, ExtendedRepository<Topic, Long> {
    List<Topic> findByDescriptionLikeIgnoreCase(String description);
}
