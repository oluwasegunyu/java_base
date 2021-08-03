package map;

public class Employee {
    private String name;

    public Employee(String aName){
        name = aName;
    }

    @Override
    public String toString(){
        return name;
    }
}
