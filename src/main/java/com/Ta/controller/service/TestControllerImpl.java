package com.Ta.controller.service;

import java.io.FileInputStream;
import java.util.Properties;

import org.springframework.stereotype.Service;

@Service
public class TestControllerImpl {
	
	
	
	public String testMethod() {
	return "service method called";
		
}
	public int add(int n1 ,int n2) {
		int n=n1+n2;

		
		return n;
	}
	public int sub(int n1 ,int n2) {
int n=n1-n2;

		
		return n;
	}
	public int multiplication(int n1 ,int n2) {
int n=n1*n2;

		
		return n;
	}
	public int division(int n1 ,int n2) {
int n=n1/n2;

		
		return n;
	}

}
