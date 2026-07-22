package Model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("file.xml");
        Student st=context.getBean("Student",Student.class);

        System.out.println(st);
    }
}
