public class People {
    String name;
    int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
    final public String sayHi() {
        return "My name is " + this.name + " I an " + this.age;
    }

    public static void main(String[] args) {
        People a = new People("Dat", 20);

        System.out.println(a.sayHi());
    }
}
