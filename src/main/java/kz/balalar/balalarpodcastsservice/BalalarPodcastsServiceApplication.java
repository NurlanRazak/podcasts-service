package kz.balalar.balalarpodcastsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BalalarPodcastsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BalalarPodcastsServiceApplication.class, args);
	}

}
