package com.ioc.demo;

import com.ioc.demo.dao.impl.TestDaoImpl;
import com.ioc.demo.service.TestService;
import com.ioc.demo.service.impl.TestServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//public class App {
//    //Service
//    public static TestServiceImpl testService;
//    public static TestDaoImpl testDao;
//    //从IOC容器中获取Bean
//    //ClassPathXmlApplicationContext参数表示基于xml配置文件拿对象，参数为配置文件在resource目录下的路径
//    public static ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//    public static void main(String[] args) {
//        System.out.println("程序启动！");
//        //根据id拿对象
//        testService = (TestServiceImpl) context.getBean("testService");
////        // 根据类型拿对象
////        testService = (TestServiceImpl) context.getBean(TestServiceImpl.class);
//        //获取Dao对象
//        testDao = (TestDaoImpl) context.getBean("testDao");
//        testService.service(testDao);
//    }
//}

public class App {
    //Service
    public static TestServiceImpl testService;
    public static TestDaoImpl testDao;
    //从IOC容器中获取Bean
    //ClassPathXmlApplicationContext参数表示基于xml配置文件拿对象，参数为配置文件在resource目录下的路径
    public static ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    public static void main(String[] args) {
        System.out.println("程序启动！");
        //根据id拿对象
        testService = (TestServiceImpl) context.getBean("testService");
        testService.service();
        testService = (TestServiceImpl) context.getBean("service");
        testService.service();
        testService = (TestServiceImpl) context.getBean("service1");
    }
}