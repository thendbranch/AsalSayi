// https://app.patika.dev/
// https://app.patika.dev/thendbranch

public class Main {
    public static void main(String[] args) {

        /*
        Ödev :
        Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
         */

        for (int i = 2; i < 100; i++) {
            int a = 0;
            for (int j = 2; j < i; j++) {
                if (i%j == 0){
                    a=1;
                    break;
                }
            }
            if (a==0){
                System.out.println(i);
            }
        }

    }
}