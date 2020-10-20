package com.stackroute;

import com.stackroute.domain.Movie;
import com.stackroute.domain.config.BeansConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);

        Movie movie = context.getBean("movie", Movie.class);
        System.out.println(movie);
    }
}