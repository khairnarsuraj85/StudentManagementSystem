public class Student {
    private int id;
    private String name;
    private String email;
    private String department;
    private int age;

    // Constructor
    public Student(int id, String name, String email, String department, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.age = age;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getDepartment() { return department; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return "ID: " + id + 
               ", Name: " + name + 
               ", Email: " + email + 
               ", Department: " + department + 
               ", Age: " + age;
    }
}