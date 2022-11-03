package com.Ta.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Ta.controller.service.TestControllerImpl;

@RestController
@RequestMapping("/api/")

public class TestController {
	String calculation;
	@Autowired
	TestControllerImpl objTestserviceImpl;

	@RequestMapping(value = "testAPI", method = RequestMethod.GET)

	public ResponseEntity<?> testApi(@RequestParam String operation, @RequestParam int n1, @RequestParam int n2)
			throws Exception {
		int ans = 0;

		// requestParam.put("Status", "Success");
//	requestParam.put("Hello", "World");
		switch (operation) {
		case "add":
			ans = objTestserviceImpl.add(n1, n2);
			break;
		case "sub":
			ans = objTestserviceImpl.sub(n1, n2);
			break;
		case "multiply":
			ans = objTestserviceImpl.multiplication(n1, n2);
			break;
		case "division":

			ans = objTestserviceImpl.division(n1, n2);
			break;

		}
//	requestParam.put("result", objTestserviceImpl.add(n1,n2));
//	requestParam.put("Sub ",objTestserviceImpl.sub(n1, n2));
//	requestParam.put("Multiplication Result",objTestserviceImpl.multiplication(n1, n2));
//	requestParam.put("Division Result",objTestserviceImpl.division(n1, n2));
		return new ResponseEntity<>(ans, HttpStatus.OK);
	}
}
