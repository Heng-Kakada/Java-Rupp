package cutString;

import java.util.StringTokenizer;

public class splitString {
    public static void main(String[] args) {

        String data = "Chanda;Female;80\r\n;Heng Thy;Male;20\r\n;Pi Ko;Male;22\r\n;Heng Kakinada;Male;39\r\n";

        String[] name = new String[10];
        String[] sex = new String[10];
        Double[] score = new Double[10];

        StringTokenizer s1 = new StringTokenizer(data, "\r\n");
        int n = 0;

        while (s1.hasMoreTokens()){
            StringTokenizer s2 = new StringTokenizer(s1.nextToken(), ";");
            while (s2.hasMoreTokens()){
                name[n] = s2.nextToken();
                sex[n] = s2.nextToken();
                score[n] = Double.parseDouble(s2.nextToken());
            }
            n++;
        }

        System.out.println("Name \t Sex \t  Score");
        for (int i = 0; i < n; i++){
            System.out.println("%s \t %s \t %.2f".formatted(name[i], sex[i], score[i]));
        }
        
    }

}
