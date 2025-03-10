class Person {
    
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;  
        this.age = age;
    }

    
    public void introduce() {
        System.out.println("Hello " + this.name);
        System.out.println("Your age is " + this.age);
    }

    public static void main(String[] args) {
        Person s1 = new Person("Jesli", 17);  
        s1.introduce();  
    }
}
