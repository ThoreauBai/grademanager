package com.grademanager.student.handler.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grademanager.beans.Student;
import com.grademanager.handler.impl.BaseHandlerImpl;
import com.grademanager.student.handler.TestHandler;

@Controller
@RequestMapping("/student")
public class TestHandlerImpl extends BaseHandlerImpl<Student> implements TestHandler{

	@RequestMapping("/test")
	public String test(HttpServletRequest request){
		Object obj = request.getAttribute("message");
		System.out.println("获取成功"+obj);
		return "success";
	}
}
