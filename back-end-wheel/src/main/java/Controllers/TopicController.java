package Controllers;

import Models.Topic;
import Storage.TopicStorage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/topics")
public class TopicController {
    //bringing in Topic storage because it holds all of the functionality
    private TopicStorage topicStorage;

    //constructor
    public TopicController(TopicStorage topicStorage) {
        this.topicStorage = topicStorage;
    }

    @GetMapping("")
    public Iterable<Topic> retrieveAllTopics() {
        return topicStorage.getAllTopics();
    }

    @GetMapping("/{id}")
    public Topic retrieveTopicById(@PathVariable Long id) {
        return topicStorage.getTopicById(id);
    }


}
