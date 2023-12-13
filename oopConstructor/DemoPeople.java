package oopConstructor;

public class DemoPeople {


    private static void toDisplay(People p){
        System.out.println("%s\t%s\t%d".formatted(p.getName(),p.getSex(),p.getAge()));
    }

    private static boolean findAgeUnder18(People p){
        return (p.getAge()<18)?true:false;
    }

    public static void main(String[] args) {
        People p1 = new People();
        People p2 = new People("piko", "Male",17);

        p1.setName("Kakada");
        p1.setSex("Male");
        p1.setAge(21);

        // p1.showInfo();
        // p2.showInfo();
        toDisplay(p1);

        System.out.println("Check p2 has age under 18 or not");
        if (findAgeUnder18(p2))
            System.out.println("%s has age under 18".formatted(p2.getName()));
        else
            System.out.println("%s has age over or equal 18".formatted(p2.getName()));
    }


}
