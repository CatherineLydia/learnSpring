package com.in28minutes.spring.basics.springin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn10StepsApplication {

	public static void main(String[] args) {

		//Loose coupling - can BubbleSort or QuickSort
		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
		System.out.println(result);
		SpringApplication.run(SpringIn10StepsApplication.class, args);
	}

}
