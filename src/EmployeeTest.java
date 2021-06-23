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
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        //每人提高百分之五的工资
        for(Employee e: staff){
            e.raiseSalary(5);
        }

        //输出雇员信息
        for(Employee e: staff){
            System.out.println("name= " + e.getName() + ", salary= " + e.getSalary() + ", hireDay= " + e.getHireDay());
        }

        //打印下一个可用ID
        int n = Employee.getNextId();
    }
}
