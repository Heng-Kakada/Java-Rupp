package napoleonNumber;

import java.util.*;

public class ConvertStringToNapoleon {

    private static Scanner scanner = new Scanner(System.in);

    int toNapoleonCode(char c)
	{
		int ascii=(int) c;
		int nCode=(ascii-64)%9;
		if (nCode==0) nCode=9;
		return nCode;
	}

    public ConvertStringToNapoleon(String name){
        name = name.replaceAll(" ", "");
        int totalNapo = 0;
        for(int i=0; i<name.length(); i++){
            totalNapo += toNapoleonCode(name.charAt(i));
        }
        totalNapo = totalNapo%9;
        if (totalNapo==0) totalNapo=9;
        System.out.println("Result of convert to sum of napoleon is %d".formatted(totalNapo));
    }

    public static void main(String[] args) {
        
        System.out.print("Input Name for Converting to Napoleon : ");   
        String name = scanner.nextLine().toUpperCase();
        scanner.close();
        // Testing: chan sonyang 
        // result: 4
        new ConvertStringToNapoleon(name);
    }

}