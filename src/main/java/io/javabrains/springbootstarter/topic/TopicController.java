package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("1","demo","demo desc"),
				new Topic("2","demo1","je suis pret"),
				new Topic("3","demo2","la meme chose")
				);
	}
}
