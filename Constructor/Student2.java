class Student {
    String name;
    String qualification;
    int age;

    // Constructor with parameters
    Student(String name, String qualification, int age) {
        this.name = name;
        this.qualification = qualification;
        this.age = age;
        System.out.println("Student Constructor called");
    }

    void study() {
        System.out.println("Student is studying");
    }

    void run() {
        System.out.println("Student is running");
    }

    void sleep() {
        System.out.println("Student is sleeping");
    }
}

class StudentApplication {
    public static void main(String[] args) {
        // Creating a Student object with constructor parameters
        Student s1 = new Student("Alice", "Bachelor's", 20);
        s1.study();
        s1.run();
        s1.sleep();
    }
}
