package StudentData;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
    public static void main(String[] args) {
        ApplicationContext stu=new ClassPathXmlApplicationContext("student.xml");
        StudentForm student=(StudentForm)stu.getBean("student");
        System.out.println(student);
     }
}
