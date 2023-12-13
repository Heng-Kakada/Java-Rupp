package convertNumberToString;


import java.util.Scanner;
import java.util.StringTokenizer;

public class ReadNumberToString {
    private final Scanner INPUT = new Scanner(System.in);
    private String digitsNum[] = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    

    String toDigit(double n) {
        String d[] = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirthteen", "Fourthteen", "Fithteen"};
        return d[(int) n];
    }

    String toDigitPoint(double n)
    {
        String dp[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        return dp[(int) n];
    }

    String toTen(double n) {
        if (n > 15 && n < 20) {
            return toDigit(n % 10) + "teen";
        }
        int r = (int) n / 10;
        String ten[] = {"", "", "Twenty", "Thirthty", "Fourty", "Fifthy", "Sixty", "Seventy", "Eigthty", "Ninety"};
        if (r <= 1) {
            return toDigit(n);
        }
        return ten[r] + " " + toDigit(n % 10);
    }
    String toHundred(double n) {
        int r = (int) n / 100;
        if (r == 0) {
            return toTen(n % 100);
        }
        return digitsNum[r] + " hundred " + toTen(n % 100);
    }

    String toThousand(double n) {
        int r = (int) n / 1000;
        if (r > 0 && r < 10) {
            return digitsNum[r] + " Thousand " + toHundred(n % 1000);
        } else if (r >= 100) {
            return toHundred(r) + " Thousand " + toHundred(n % 1000);
        } else if (r >= 10) {
            return toTen(r) + " Thousand " + toHundred(n % 1000);
        }
        return toHundred(n % 1000);
    }

    String toMillion(double n) {
        int r = (int) (n / Math.pow(10, 6));
        if (r > 0 && r < 10) {
            return digitsNum[r] + " Million " + toThousand(n % Math.pow(10, 6));
        } else if (r >= 100) {
            return toHundred(r) + " Million " + toThousand(n % Math.pow(10, 6));
        } else if (r >= 10) {
            return toTen(r) + " Million " + toThousand(n % Math.pow(10, 6));
        }
        return toThousand(n % Math.pow(10, 6));
    }

    String toBillion(double n) {
        int r = (int) (n / Math.pow(10, 9));
        if (r > 0 && r < 10) {
            return digitsNum[r] + " Billion " + toMillion(n % Math.pow(10, 9));
        } else if (r >= 100) {
            return toHundred(r) + " Billion " + toMillion(n % Math.pow(10, 9));
        } else if (r >= 10) {
            return toTen(r) + " Billion " + toMillion(n % Math.pow(10, 9));
        }
        return toMillion(n % Math.pow(10, 9));
    }

    String readNum(double n) {
        // check if n is integer
        if (validatedInteger(n)) {
            return toBillion((double) n);
        }
        // if n is double
        StringTokenizer st = new StringTokenizer(n + "", ".");
        String result = toBillion(Double.parseDouble(st.nextToken())).trim() + " Point ";
        for(char c : st.nextToken().toCharArray()){
            result += toDigitPoint(Double.parseDouble(c + "")) + " ";
        }
        return  result;
    }

    private boolean validatedInteger(double n){
        return (n%1 == 0)?true:false;
    }

    private ReadNumberToString(){
        System.out.println("Demo Number");
        System.out.println(readNum(10321441));
        System.out.println(readNum(1.2));

        System.out.print("Enter Number : ");
        double num = INPUT.nextDouble();
        System.out.println("%f is %s".formatted(num, readNum(num)));
    }


    public static void main(String[] args) {
        new ReadNumberToString();
    }
}