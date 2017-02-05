package com.grademanager.handler.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grademanager.beans.Name;
import com.grademanager.beans.Student;
import com.grademanager.handler.TestHandler;
import com.grademanager.services.NameService;

@Controller
@RequestMapping("/student")
public class TestHandlerImpl extends BaseHandlerImpl<Student> implements TestHandler{

	@Autowired
	private NameService nameService;
	
	@RequestMapping("/test")
	public String test(HttpServletRequest request){
		
		Object obj = request.getAttribute("message");
		System.out.println("获取成功"+obj);
		List<Name> allName = nameService.getAllName();
		System.out.println(allName);
		return "success";
	}
}
