package sg.edu.rp.c346.employeeinfo;

/**
 * Created by 16019829 on 16/7/2018.
 */

public class EmployeeInfo {

    private String name;
    private String title;
    private String salary;

    public EmployeeInfo(String name, String title, String salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
