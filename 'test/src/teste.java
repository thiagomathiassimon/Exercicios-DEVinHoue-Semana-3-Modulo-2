public class teste {

    public static void main(String[] args) {

        boolean repete = true;

        int x = 1;

        while(repete) {

            System.out.println(x);


            if (x > 20) {

                System.exit(1);

            } else {


                x = x + 1;

            }
        }

    }

}
