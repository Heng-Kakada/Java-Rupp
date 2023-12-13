package oopConstructor;

public class People {

    private String name;
    private String sex;
    private int age;

    public People() {}

    public People(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // void showInfo(){
    //     System.out.println("%s\t%s\t%d".formatted(name,sex,age));
    // }
    // default Constructor
    // public People(){}

    // when user defined constructor default constructor auto delete
}
