package com.stackroute;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stackroute.config.AppConfig;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;


public class Main {

	public static void main(String[] args) 
	{
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class); 
		//Actor actorOne = applicationContext.getBean("Prabhas",Actor.class);
		//Actor actorTwo = applicationContext.getBean("Anushka",Actor.class);
		//Actor actorThree = applicationContext.getBean("Nithin",Actor.class);
		//Actor actorFour = applicationContext.getBean("Kajal",Actor.class);

		Movie movie =applicationContext.getBean(Movie.class);
		System.out.println(movie);		
		//System.out.println(actorOne);
		//ystem.out.println(actorTwo);
		//System.out.println(actorThree);
		//System.out.println(actorFour);

		
		
		
	}
}