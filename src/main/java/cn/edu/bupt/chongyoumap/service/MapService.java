package cn.edu.bupt.chongyoumap.service;

import cn.edu.bupt.chongyoumap.pojo.po.Topic;
import cn.edu.bupt.chongyoumap.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MapService {

    @Autowired
    private TopicRepository topicRepository;

    @Transactional
    public List<Topic> queryAllTopics(){
        return topicRepository.findAll();
    }

}
