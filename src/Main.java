public class Main {
    public static void main(String[] args) {
         Main main = new Main();
         System.out.println(main.add(5, 5));


         int a = 10;
         int b = 15;

         System.out.println(main.multiply(a, b));
         System.out.println(main.isPita(3, 4, 5));
        System.out.println(main.sumOfDigit(123));

        System.out.println(main.NWD(99, 39));

        main.test();
    }

    public int add(int a, int b){
        return a + b;
    }

    public int substract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }

    public boolean isPita(int a, int b, int c){
        return a * a + b * b == c * c;
    }

    //123
    public int sumOfDigit(int a){
        int sum = 0;
        while (a != 0){
             sum += a % 10;
             a = a / 10;
        }

        return sum;
    }

    //16 -> 8
    // 1 * 1 = 16?
    // 2 * 2 == 16?
    //..
    //4 * 4 = 16? SUCCESS!
    public boolean isSquare(int a){
       for(int i = 1; i < a / 2; i++){
           if(i * i == a){
               return true;
           }
       }
       return false;
    }

    //17 ~ 4,123131
    //0,121213
    public boolean isSquare1(int a){
        return Math.sqrt(a) % 1 == 0;
    }

    public boolean isSquare2(int a){
        return Math.sqrt(a) == (int) Math.sqrt(a);
    }

    public boolean isPrime(int a){
        for(int i = 2; i < a; i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }

    public void test() {
        long timeStart =  System.nanoTime();
        NWD(492848202, 249253484);
        long timeStop = System.nanoTime();

        long timeStart1 =  System.nanoTime();
        EUKS(492848202, 249253484);
        long timeStop1 = System.nanoTime();


        System.out.printf("NWD: " + (timeStop - timeStart));
        System.out.printf("EUK: " + (timeStop1 - timeStart1));

    }

    public int NWD(int a, int b){
        int min = Math.min(a, b);
        for (int i = min; i > 0; i--) {
             if(a % i == 0 && b % i == 0){
                 return i;
             }
        }
        return 1;
    }

    // 33 11
    // 22 11
    // 11 11
    public int EUKS(int a, int b){
        while (a != b){
            if(a > b){
                a -= b;
            }else{
                b -= a;
            }
        }
        return a;
    }
}
