package com.aroussi.blog.web;

import com.aroussi.blog.service.TopicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Topic Controller")
@RestController
public class TopicController extends AbstractController {

    TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @ApiOperation(value = "Get All Topics")
    @GetMapping(value = "/topics")
    public ResponseEntity allTopics(){
        return ResponseEntity.status(HttpStatus.OK).body(topicService.allTopics());
    }
}
