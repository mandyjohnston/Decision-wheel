package org.wecancodeit.campusesbootcamps;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.campusesbootcamps.models.Topic;
import org.wecancodeit.campusesbootcamps.repositories.TopicRepository;

@Component
public class Populator implements CommandLineRunner {

	@Resource
	private TopicRepository topicRepo;

	@Override
	public void run(String... args) throws Exception {

		Topic workout = new Topic("Workout", "Long Run", "HIIT", "Peloton", "Yoga");
		Topic dinner = new Topic("Dinner", "Curry Bowl", "Ahi Tuna Steak", "Pizza", "Ravioli");

		topicRepo.save(workout);
		topicRepo.save(dinner);
	}

}
