package oopConstructor;

public class People {


    String name;
    String sex;
    int age;

    public People() {}

    public People(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    void showInfo(){
        System.out.println("%s\t%s\t%d".formatted(name,sex,age));
    }

    // default Constructor
    // public People(){}

    // when user defined constructor default constructor auto delete

}
