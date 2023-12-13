import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        String str = "hello";
        //MyString my str = new MyString(new char[] {'H','e','l','l','o','!'});
        String str2 = new String(new char[] {'H','e','l','l','o','!'});

        str2 = str2 + "abc";

        System.out.println(UUID.randomUUID());//Возвращает строковый идентификатор
        System.out.println(UUID.randomUUID());
        System.out.println(UUID.randomUUID());
        System.out.println(UUID.randomUUID());


        //first
        String buf = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++){
            buf = buf + UUID.randomUUID();
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " ms");


        //second
        StringBuilder stringBuilder = new StringBuilder(30000);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            stringBuilder.append(UUID.randomUUID());
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " ms");

    }
}
