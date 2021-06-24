package inheritance;

/**
 * 继承的示例，manager继承employee
 */
public class ManagerTest {
    public static void main(String[] args){
        //创建manager对象
        Manager boss = new Manager("carl Cracker", 80000, 1987, 10, 27);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        //填充雇员数据
        staff[0] =  boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 11,11);
        staff[2] = new Employee("Tommy Tester", 40000, 1990,11,1);

        //输出雇员信息
        for(Employee e:staff){
            System.out.println("name = " + e.getName() + " salary = " + e.getSalary());
        }
    }

}
