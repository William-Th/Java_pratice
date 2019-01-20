package Class_pratice;

        import java.util.Date;

/**
 * Created by wtu on 1/10/2019.
 */
public class Teacher {
    String Id;
    public String name;
    private int salary;
    private static int teacher_count = 0;

    public Teacher(String name, String Id)
    {
        this.Id = Id;
        this.name = name;
        teacher_count+=1;
        System.out.println("Teacher count: "+teacher_count);
    }

    public Teacher(String name, String Id,int salary)
    {
        this.Id = Id;
        this.name = name;
        this.salary = salary;
        teacher_count+=1;
        System.out.println("Teacher count: "+teacher_count);
    }

    public int getSalary()
    {
        return this.salary;
    }

    public static int getTeacherCount ()
    {
        return teacher_count;
    }

    static {
        System.out.println("This is the static area!");
    }

    {
        System.out.println("This is not the static area!");
    }
}


