import java.util.Arrays;

public class StringStringBuilder {
    public static void main(String[] args) {

        String s = "Hello!";
        String s1 = "Hello!";
        s = s1; // Если содержимое 2-х строк одинаковое, то второй объект не создается, а второй ссылается на первый
        // в таком случае возможно равенство (только в этом случае)
        System.out.println(s == s1); //true
        System.out.println(s1.equals(s));//для сравнения двух строк

        Throwable t = new Throwable();
        Throwable t1 = new Throwable(); //2 абсолютно одинаковых объекта
        System.out.println(t == t1); // false

        s.equals(s1);// true если строки полность равны, else false

        s.contains("llo");//true, так как s содержит (включает) запрашиваемую последовательность символов

        s.repeat(4); // Повторяет строку "4" раза, не изменяя строку
        System.out.println("-".repeat(25));

        s.getBytes();//возвращает массив байт с буквами в каждом элементе?

        s.toLowerCase();//возвращает строку в нижнем регистре
        System.out.println("HEllO WORld!!".repeat(5).toLowerCase()); //hello world!!hello world!!hello world!!hello world!!hello world!!
        s.toUpperCase();

        s.toCharArray();// Возвращает массив символов строки;

        s.charAt(1);//возвращает конкретный символ под индексом "2"
        System.out.println(s.charAt(s.length()/2));// l

        s.indexOf('s');// -1; возвращает индекс искомого символа, или -1
        s.indexOf("ell"); // 1 - индекс первого символа в совадающей последовательности, -1
        s.indexOf('H');// 0 - Поиск слева направо
        s.indexOf('H',s.indexOf('H') + 1); //Вернет индекс следующего символа, после найденного ранее
        s.lastIndexOf('l');// поиск справа налево
        s.lastIndexOf('l', s.lastIndexOf('l') - 1);

        s.isEmpty();// Пустая ли строка?


        String g = "Great!";
        String h = "Humour";
        g.replace("Gr", "T");// Замена символов
        System.out.println(g.repeat(5).replace('r', 'M'));// GMeat!GMeat!GMeat!GMeat!GMeat!
        System.out.println(g.replace("!", "").repeat(3));// GreatGreatGreat - удаление символа из всей строки

        h.replaceFirst("u", "!");
        System.out.println(h.replaceFirst("u", "!"));// H!mour

        String k = "I'm  so a happy man and father!";
        k.split(" ");// возвращает массив строк из строки, разделенной по разделителю " "
        String[] temp = k.repeat(3).split(" ");
        System.out.println(Arrays.toString(temp));

        //StringBuilder//
        StringBuilder builder = new StringBuilder("I'm so a happy man and father");
        builder = new StringBuilder(s);
        builder = new StringBuilder(123);// цифра - первоначальная емкость массива, на котором основам StringBuilder

        String l = builder.toString();

        builder.append(0.34); //числовое значение превращает в строку и сохраняет в формате строки в строке
        builder.append(0.37).append("+").append(6.15).append("=").append(2.2f);

        builder.charAt(builder.length()/2);

        builder.indexOf("'");
        builder.indexOf("'",builder.indexOf("'") + 1);
        builder.lastIndexOf("m");
        builder.lastIndexOf("m", builder.lastIndexOf("m") - 1);

        builder.reverse(); //Разворачивает строку

        builder.replace(0, builder.length()/2, "G^G"); //3 обязательных параметра: 1,2 - промежуток, который поменять; 3 - символы, на которые поменять.

        builder.insert(0, "new text"); // Вставляет новый текст по заданному индексу, сдвигаяя содержимое

        builder.delete(builder.length()/2, builder.length()/2 + 2); //Удаляет элементы по указанному диапазону

        builder.deleteCharAt(builder.length()/2); // Удаляет символ по заданному индексу

        System.out.println(builder);//new textG73.043.0 - каждый метод builder изменяет предыдущее состояние строки


        String str = "";
        StringBuilder builder1 = new StringBuilder("");

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            str += Character.getName(i);
        }
        System.out.println("String time = " + (System.currentTimeMillis() - start)); //String time = 17196

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            builder1.append(Character.getName(i));
        }
        System.out.println("StringBuilder time = " + (System.currentTimeMillis() - start2)); //StringBuilder time = 8

        str = new StringBuilder(str).reverse().toString(); //Разворот строки в 1 строчку
    }
}
