package com.example.demo;

import com.example.demo.reuse.ClassA;
import com.example.demo.reuse.ClassB;
import com.example.demo.reuse.ClassC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	private String testMethod() {
		ClassA classA = new ClassA();
		ClassC classC = new ClassC();
		ClassB classB= new ClassB();
		int classAHashCode = classA.hashCode();
		int classBHashCode = classC.hashCode();
		classBHashCode = new ClassA().hashCode();
		int sum = classAHashCode + classBHashCode + 654654;
		System.out.println(sum + 6476);
		return "method end";
	}
}
