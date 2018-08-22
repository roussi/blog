package com.aroussi.blog.service.impl;

import com.aroussi.blog.model.Topic;
import com.aroussi.blog.service.TopicService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Service
public class TopicServiceImpl implements TopicService {

    @PersistenceContext
    private EntityManager entityManager;

    public Collection<Topic> allTopics(){
        return entityManager.createQuery("select t from Topic t").getResultList();
    }
}
