package kz.balalar.balalarpodcastsservice.resources;

import kz.balalar.balalarpodcastsservice.models.PodcastItem.PodcastItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/podcast")
public class PodcastResource {

    @RequestMapping("/{podcastId}")
    public PodcastItem getPodcast(@PathVariable("podcastId") String podcastId) {
        return new PodcastItem("Joe Rogan Experience", "Test test test", "https://www.youtube.com/watch?v=EWU5mt0DFDc", 5);
    }
}
