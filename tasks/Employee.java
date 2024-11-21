import java.text.*;
import java.util.*;

class Employee {
    private String id;
    private String name;
    private int age;
    private Date dateOfJoining;

    public Employee(String id, String name, int age, String dateOfJoining) throws ParseException {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfJoining = new SimpleDateFormat("yyyy-MM-dd").parse(dateOfJoining);
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Date getDateOfJoining() {
        return dateOfJoining;
    }
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "Employee{id='" + id + "', name='" + name + "', age=" + age + ", dateOfJoining=" + sdf.format(dateOfJoining) + "}";
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id.equals(employee.id);
    }
}
