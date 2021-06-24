package inheritance;

public class Manager extends Employee{
    private double bonus;

    /**
     * @param name 雇员名字
     * @param salary 基本工资
     * @param year 入职年份
     * @param month 入职月份
     * @param day   入职日
     */

    public Manager(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double aBonus){
        bonus = aBonus;
    }
}
