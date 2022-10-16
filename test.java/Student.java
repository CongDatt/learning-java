public class Student extends People {

    String age;
    String name;
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public String sayHello() {
        return "My name is " + this.name + " I am studying at " + this.grade;
    }

    public static void main(String[] args) {
        Student Dat = new Student("Dat", 20, "10");

        System.out.println(Dat.sayHello());
    }
}
