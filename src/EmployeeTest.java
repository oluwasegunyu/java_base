import java.util.*;

/**
 * This program tests the Employee class
 * @author yxy
 */
public class EmployeeTest{
    public static void main(String[] args){
        /*
        创建三个雇员对象
         */
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000);
        staff[1] = new Employee("Harry Hacker", 50000);
        staff[2] = new Manager("Tony Tester", 40000.0);

        //输出雇员信息
        for(Employee e: staff){
            e.setId();
            System.out.println("name= " + e.getName() + ", salary= " + e.getSalary() + ", id= " + e.getId());
            System.out.println(e.getClass().getName()+ " " + e.getName());
        }

        //打印下一个可用ID
        int n = Employee.getNextId();
        System.out.println("Next available id=" + n);
    }
}
