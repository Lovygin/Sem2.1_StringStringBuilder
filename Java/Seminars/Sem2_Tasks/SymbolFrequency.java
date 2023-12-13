import java.util.Scanner;

public class SymbolFrequency {
    public static void main(String[] args) {

        int[] statistic = new int[26];
        Scanner in = new Scanner(System.in);
        statistic[98-97]++;
        char a = 'a';
        char c;
        int noA = a; // 97
        System.out.println("Enter a String: ");
        String s = in.nextLine();
        for (int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            if (c >= 'a' && c <= 'z'){
                statistic[c - noA]++;
            }
        }
        System.out.println("Result of the program:");
        for(int i =0; i < statistic.length; i++){
            if (statistic[i] > 0){
                char cc = (char)(i + noA); //Явное приведение типов с символьному типу
                System.out.printf(">>> %s : %d\n", cc, statistic[i]); // s- string/char; d - decimal

            }
        }

    }
}
