package com.beansoup.magic;

import com.beansoup.magic.soup.Soupmaker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(DemoApplication.class, args);
		Soupmaker soupmaker = ac.getBean(Soupmaker.class);
		soupmaker.makeSoup();
	}

}
