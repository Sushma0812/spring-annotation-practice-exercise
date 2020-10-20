package com.stackroute.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;


public class AppConfig 
{
	@Bean("Prabhas")
	public Actor getActorOne()
	{
		return new Actor("Prabhas","male",35);
	}
	@Bean("Anushka")
	public Actor getActorTwo()
	{
		return new Actor("Anushka","female",30);
	}
	@Bean("Nithin")
	public Actor getActorThree()
	{
		return new Actor("Nithin","male",32);
	}@Bean("Kajal")
	public Actor getActorFour()
	{
		return new Actor("Kajal","female",29);
	}	
	@Bean
	@Scope("prototype")
	public Movie getMovie()
	{
		 Movie movie = new Movie(getActor
				 ());
		 return movie;
		 
	}
}