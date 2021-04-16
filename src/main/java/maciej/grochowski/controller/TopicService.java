package maciej.grochowski.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Core Java", "Java Description"),
            new Topic("javascript", "JavaScript", "JavaScript Description")
    ));

    public List<Topic> findAllTopics() {
        return topics;
    }

    public Topic getSingleTopic(String id) {
        return topics.stream()
                .filter(x -> x.getID().equals(id))
                .findFirst()
                .get();
    }

    public void addTopics(Topic topic) {
        topics.add(topic);
    }

//    public void updateTopic(Topic topic, String id) {
//        for (int i = 0; i < topics.size(); i++) {
//            Topic tmp = topics.get(i);
//            if (tmp.getID().equals(id))
//                topics.set(i, topic);
//        }
//    }
//
//    public void deleteTopic(Topic topic, String id) {
//        topics.removeIf(x -> x.getID().equals(id));
//    }
}