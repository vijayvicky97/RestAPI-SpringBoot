package com.example.demo.topic;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    public List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("spring","spring Framework", "Spring despcription"),
                new Topic("Java","Java spring Framework2", "Java Spring despcription"),
                new Topic("Python","Python spring Framework3", "Python Spring despcription")
    ));

    public List<Topic> getAllTopics(){
        return this.topics;
    }

    public Topic getTopic(String id){
        return this.topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void setTopic(Topic topic){
        this.topics.add(topic);
    }

    public void putTopic(Topic topic, String id){
        this.topics.replaceAll(t -> t.getId().equals(id) ? topic : t);
    }

    }
