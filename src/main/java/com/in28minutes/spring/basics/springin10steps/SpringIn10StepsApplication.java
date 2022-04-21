package com.in28minutes.spring.basics.springin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn10StepsApplication {

	//What are the beans?
	//What are the dependencies of a bean?
	//Where to search for beans?

	public static void main(String[] args) {

		//Loose coupling - can BubbleSort or QuickSort
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());


		//Application Context
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsApplication.class, args);

		//get the bean from applicationContext
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);

		System.out.println(result);

	}

}
