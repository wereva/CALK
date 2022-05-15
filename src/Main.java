public class Main {

    static int result(int a, int b, int c){
        return (a + b + c) / 3;
    }
    public static void main(String[] args) {
        int a = 2, b = 4, c = 6;
        int sum = result(a, b, c);

        System.out.println(a + "+" + b + "+" + c + "/" + 3 + "=" + sum);


        }
    }
