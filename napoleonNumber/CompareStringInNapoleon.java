package napoleonNumber;

import java.util.*;

public class CompareStringInNapoleon {

    private Scanner scanner = new Scanner(System.in);

    //#region 
        //if fchar have in string 1 ,so delete those fchar at string 2
        //else fchar don't have in string 2, so put fchar ot name11
        //when loops ended concat name11 wiht name2

        //Eg:
            //name1 = SOK TANCHAY
            //name2 = CHAN PISEY

            // after processing

            //name1 = SOK TANCHAY
            //name2 = PIE

            // name11 = OKTA

            // result = name11 + name2 = OKTAPIE
    String sumName(String name1, String name2) {
        String name11 = "";
        for (int i = 0; i < name1.length(); i++) {
            String fchar = name1.charAt(i) + "";
            int chk = name2.indexOf(fchar);
            if (chk >= 0) {
                name2 = name2.replaceFirst(fchar, "");
            } else {
                name11 = name11 + fchar;
            }
        }
        return name11 + name2;
    }

    //#endregion
    //#region 
    //testing sumName2 Algorithms

    //name1 = SOK TANCHAY
    //name2 = CHAN PISEY

    // after processing

    //name1 = OK TA
    //name =  PIE
    // SANCHY, this is the char that we replace by "_"

    String mySumName(String name1, String name2){
        for(int i = 0; i < name1.length(); i++){
            String chk1 = name1.charAt(i) + "";
            int chk2 = name2.indexOf(chk1);
            if(chk2 >= 0){
                name1 = name1.replaceFirst(chk1, " ");
                name2 = name2.replaceFirst(chk1, " ");
            }
        }
        name1 = name1.replaceAll(" ", "");
        name2 = name2.replaceAll(" ", "");
        return name1 + name2;
    }
    //#endregion

    public CompareStringInNapoleon(){
        System.out.print("Enter Name 1: ");
        String name1 = scanner.nextLine().toUpperCase();
        System.out.print("Enter Name 2: ");
        String name2 = scanner.nextLine().toUpperCase();
        
        // Testing: name1 = Sok TanChay, name2 = Chan Pisey
        // result: 5
        new ConvertStringToNapoleon(mySumName(name1.toUpperCase(), name2.toUpperCase()));
    }

    public static void main(String[] args){
        new CompareStringInNapoleon();
    }
}
