package math;

public class App {
    public static void main(String[] args) {
        System.out.println("\nRound\n");
        System.out.println("Math.round(5.7654)="+Math.round(5.7664));
        System.out.println("MyMath.roundX(5.7664,2)="+MyMath.roundX(5.7664,2));
        System.out.println("MyMath.roundX(5.7664,3)="+MyMath.roundX(5.7664,3));
        System.out.println("MyMath.round100(750)="+MyMath.round100(750));
        System.out.println("MyMath.round100(7549)="+MyMath.round100(7549));
        System.out.println("MyMath.round1000(57464)="+MyMath.roundX(57464,-3));
        System.out.println("MyMath.round1000(57500)="+MyMath.roundX(57500,-3));

        System.out.println("\nFloor\n");
        System.out.println("Math.floor(5.4654)="+Math.floor(5.9));
        System.out.println("MyMath.floorX(...)="+MyMath.floorX(5.7664,1));
        System.out.println("MyMath.floor100(...)="+MyMath.floor100(750));

        System.out.println("\nCeil\n");
        System.out.println("Math.ceil(5.7664)="+Math.ceil(5.7664));
        System.out.println("MyMath.ceilX(5.7611,2)="+MyMath.ceilX(5.7611,2));
        System.out.println("Math.ceil(721)="+Math.ceil(721));
        System.out.println("MyMath.ceil100(721)="+MyMath.ceil100(721));

    }   
}
