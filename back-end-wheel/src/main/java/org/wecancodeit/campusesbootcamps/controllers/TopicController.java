package org.wecancodeit.campusesbootcamps.controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.campusesbootcamps.models.Topic;
import org.wecancodeit.campusesbootcamps.repositories.TopicRepository;

@CrossOrigin
@RestController
@RequestMapping("/topics")

public class TopicController {

	@Resource
	private TopicRepository topicRepo;

	@GetMapping("")
	public Collection<Topic> getTopics() {
		return (Collection<Topic>) topicRepo.findAll();
	}

}
