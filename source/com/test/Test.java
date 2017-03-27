package com.test;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.grademanager.beans.Name;
import com.grademanager.services.NameService;

public class Test {

	
	@org.junit.Test
	public void te(){
		ApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		final NameService bean = (NameService) ioc.getBean("nameService");
for (int i = 0; i < 1000000000; i++) {
			
			Name name1 = new Name(Thread.currentThread().getName()+i, "name"+Thread.currentThread().getId()+i,0);
			bean.insertName(name1);
			System.out.println(Thread.currentThread().getName()+"---"+i);
			}
	}
	
	@org.junit.Test
	public void test(){
		
		long start = System.currentTimeMillis();
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		Runnable myRunable = new MyRunable2();
		for (int i = 0; i < 10; i++) {
		newCachedThreadPool.execute(myRunable);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
	}
}

class MyRunable2 implements Runnable{
	ApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	final NameService bean = (NameService) ioc.getBean("nameService");
	@Override
	public void run() {
		for (int i = 0; i < 1000000; i++) {
			
			Name name1 = new Name(Thread.currentThread().getName()+i, "name"+Thread.currentThread().getId()+i,0);
			bean.insertName(name1);
			System.out.println(Thread.currentThread().getName()+"---"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
