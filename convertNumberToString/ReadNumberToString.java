package convertNumberToString;

import java.util.Scanner;

public class ReadNumberToString {
    String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public  String convertToWords(int number){
        String result2 = "";

        if (number % 100 < 10) {
            result2 = units[number % 100];
            number /= 100;
        } else if (number % 100 < 20) {
            result2 = teens[number % 10];
            number /= 100;
        } else {
            result2 = units[number % 10];
            number /= 10;

            result2 = tens[number % 10] + result2;
            number /= 10;
        }

        if (number > 0) {
            result2 = units[number] + " Hundred " + result2;
        }
        return result2;
    }
    public String convertToWordsUpToBillion(int number){
        String result1 = "";
        if(number==0){
            return "Zero";
        }
        int billion = number / 1000000000;
        int million = (number % 1000000000) / 1000000;
        int thousand = (number % 1000000) / 1000;
        int remainder = number % 1000;

        if (billion > 0) {
            result1 += convertToWords(billion) + " Billion ";
        }

        if (million > 0) {
            result1 += convertToWords(million) + " Million ";
        }

        if (thousand > 0) {
            result1 += convertToWords(thousand) + " Thousand ";
        }

        if (remainder > 0) {
            result1 += convertToWords(remainder);
        }
        return result1.trim();
    }
    ReadNumberToString(){
        Scanner Number = new Scanner(System.in);
        System.out.print("Enter number you want ot convert: ");
        int number = Number.nextInt();
        Number.close();
        String str = convertToWordsUpToBillion(number);
        System.out.println(str);
    }
    public static void main(String[] args) {
        new ReadNumberToString();
    }
}