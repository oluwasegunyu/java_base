package inheritance;

public class Student  extends Person{
    private String major;
    /**
     * @param n the student's name
     * @param m the student's major
     */
    public Student(String n, String m){
        //用父类构造器
        super(n);
        major = m;
    }

    public String getDescription(){
        return "a student major in " + major;
    }
}
