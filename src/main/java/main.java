public class main {

    public static void main(String[] args) {

        for(int i = 1; i<=200; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("BuzzFizz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Bizz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void printNumbers(int start, int end){
        for(int i = start; i <=end; i++){
            System.out.println(i);
        }


    }
}
