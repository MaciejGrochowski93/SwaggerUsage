package maciej.grochowski.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping(method = RequestMethod.GET, value = "/topics")
    @ApiOperation(value = "Returns all topics")
    public List<Topic> getAllTopics() {
        return topicService.findAllTopics();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/topics/{id}")
    @ApiOperation(value = "Finds a topic by id", notes = "Provide the id and the topic will be found", response = Topic.class)
    public Topic getSingleTopic(@ApiParam (value = "ID is the unique number of every topic", required = true) @PathVariable String id) {
        return topicService.getSingleTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    @ApiOperation(value = "Adds a new topic", notes = "You can create plenty of new topics and add them to the topic list", response =  Topic.class)
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopics(topic);
    }

//    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
//    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
//        topicService.updateTopic(topic, id);
//    }
//
//
//    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
//    public void deleteTopic(@RequestBody Topic topic, @PathVariable String id) {
//        topicService.deleteTopic(topic, id);
//    }

}
