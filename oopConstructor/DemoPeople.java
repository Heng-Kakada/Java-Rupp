package oopConstructor;

public class DemoPeople {

    public static void main(String[] args) {
        People p1 = new People();
        People p2 = new People();

        p1.name = "Kakada";
        p1.age = 21;
        p1.sex = "Male";

        p2.name = "piko";
        p2.sex = "Male";
        p2.age = 18;


        p1.showInfo();
        p2.showInfo();
    }


}
