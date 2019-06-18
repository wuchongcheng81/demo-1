package com.example.demo;

import com.example.demo.reuse.ClassA;
import com.example.demo.reuse.ClassB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	private String testMethod() {
		ClassA classA = new ClassA();
		ClassB classB = new ClassB();
		int classAHashCode = classA.hashCode();
		int classBHashCode = classB.hashCode();
		int sum = classAHashCode + classBHashCode;
		System.out.println(sum);
		return "method end";
	}
}
