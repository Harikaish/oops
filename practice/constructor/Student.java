public class Student{
    String name;
    int age;
    String course;

    Student() {
        name = "Unknown";
        age = 0;
        course = "Not Assigned";
    }

    Student(String n, int a, String c) {
        name = n;
        age = a;
        course = c;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayInfo();
        Student s2 = new Student("Alice", 20, "Computer Science");
        s2.displayInfo();
    }
}