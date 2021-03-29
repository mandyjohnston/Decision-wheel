package Storage;

import Models.Topic;
import com.wheel.demo.TopicRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@Service
public class TopicStorage {

    //bringing in Topic Repository because it extends CrudRepository (which allows for .save etc)
    @Resource
    private TopicRepository topicRepo;

    //constructor
    public TopicStorage(TopicRepository topicRepo){
        this.topicRepo = topicRepo;
    }

    public void addTopic(Topic inTopic) {
        topicRepo.save(inTopic);
    }

    public Iterable<Topic> getAllTopics() {
        return topicRepo.findAll();
    }

    public Topic getTopicById(Long id) {
        Optional<Topic> retrievedTopicOptional = topicRepo.findById(id);

        if(retrievedTopicOptional.isPresent()) {
            Topic foundTopic = retrievedTopicOptional.get();
            return foundTopic;
        }
        return null;
    }

}

