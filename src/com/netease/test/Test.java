package com.netease.test;

import com.netease.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 将依赖的jar包放在lib文件夹中:
 *  在工程根目录下，新建一个lib文件夹与src同级
 *  将依赖的jar下载好后，放在该目录下
 *  选中jar，右键Add as Library...，添加到classpath中
 *
 * 而不在 Project Structure的 Modules中添加
 *
 * 是因为可以将这些文件统一管理起来，以便直接使用，无须去找配置，用build tool工具就不需要了，例如maven
 * */
public class Test {

public static void main(String[] args) {
	
	Student student = new Student();
	student.setStuNo(1);
	student.setStuName("zs");
	student.setStuAge(23);

	System.out.println(student);
	
//	Spring上下文对象: context
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	Student student1 = (Student)context.getBean("student");
	
	System.out.println(student1);
}
}
