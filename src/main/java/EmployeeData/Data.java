package EmployeeData;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Data {
    public static void main(String[] args) {
        ApplicationContext emp=new ClassPathXmlApplicationContext("New.xml"); {
        employee litu=(employee) emp.getBean("Litu");
            System.out.println(litu);
        }
    }
}
