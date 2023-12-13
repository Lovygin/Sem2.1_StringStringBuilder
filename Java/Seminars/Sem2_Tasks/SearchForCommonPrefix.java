import java.util.Arrays;

/*
Напишите метод, который находит самую длинную строку общего
префикса среди массива строк.
📌 Если общего префикса нет, вернуть пустую строку "".
 */


public class SearchForCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"mint", "mini", "mineral"};
        System.out.println(processArray(arr));

    }

    static String processArray(String[]  arr){
        int size = arr.length;
        if (size == 0)
            return "";
        else if (size == 1) return arr[0];
        else{
            Arrays.sort(arr);
            int length = arr[0].length();
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < length; i++ ){
                if(arr[0].charAt(i) == arr[size - 1].charAt(i))
                    stringBuilder.append(arr[0].charAt(i));
                else break;
            }
            return stringBuilder.toString();
        }
    }
}
