package com.grademanager.handler.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import com.grademanager.handler.BaseHandler;

public class BaseHandlerImpl<T> implements BaseHandler<T> {
	/*
	 * 所有的泛型的类型，并不是直接通过T获取，而是有具体的步骤
	 * 
	 *	1:为了能够让所有的类，可以再被创建对象的时候自动动态获取泛型类型，
	 * 	所以要写在构造器或者语句块中:
	 * 			但是，在语句块中是没有办法获取当前对象的，所以否定之后，只能放在父类的构造器中，而且是无参构造器 ->super();
	 *	2:当使用this的时候，这个时候this仍旧是子类的当前对象，也就是子类对应的对象，
	 *	所以
	 *		a:通过子类获取子类的Class对象
	 *		b:通过获取的Class对象，调用获取父类的方法getGenericeSuperClass()获取直接超类
	 *		c:通过超类得到的是Type类型的对象，这个时候我们强制转换为 参数化的对象。
	 *		d:通过调用参数化对象的 getActualTypeArgments()方法获取参数化泛型 然后进行获取指定位置的参数类型
	 */
	protected Class<T> clazz;
	public BaseHandlerImpl(){
		Type genericSuperclass = this.getClass().getGenericSuperclass();
		ParameterizedType pt  = (ParameterizedType)genericSuperclass;
		Type type = pt.getActualTypeArguments()[0];
		clazz = (Class<T>)type;
		System.out.println(clazz);
		
	}
}
