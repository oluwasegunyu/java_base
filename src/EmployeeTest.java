import java.util.*;

/**
 * This program tests the Employee class
 * @author yxy
 */
public class EmployeeTest{
    public static void main(String[] args) {
        /*
        测试1,测试三倍工资
         */
        System.out.println("测试三倍工资");
        double percent = 10;
        System.out.println("Before: percent= " + percent);
        tripleValue(percent);
        System.out.println("After: percent= " + percent);

        //测试2，三倍工资可行
        System.out.println("\n测试三倍工资2");
        Employee harry = new Employee("Harry", 5000);
        System.out.println("Before: salary= "+ harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary= " + harry.getSalary());

        //测试3, 方法不能改变参数的引用
        System.out.println("\n测试交换");
        Employee a = new Employee("Alice", 7000);
        Employee b = new Employee("Bob", 6000);
        System.out.println("Before: a = " + a.getName());
        System.out.println("Before: b = " + b.getName());
        swap(a, b);
        System.out.println("After: a = " + a.getName());
        System.out.println("After: b = " + b.getName());

    }

        //三倍工资执行函数，错误的方法
        public static void tripleValue(double x){
            x = 3*x;
            System.out.println("End of method: x=" + x);
        }

        //三倍工资，正确方法
        public static void tripleSalary(Employee x){
            x.raiseSalary(200);
            System.out.println("End of method: x=" + x.getSalary());
        }

        //交换对象
        public static void swap(Employee x, Employee y){
            Employee temp =x;
            x =y;
            y = temp;
            System.out.println("End of method: x= " + x.getName());
            System.out.println("End of method: x= " + y.getName());
        }
}
