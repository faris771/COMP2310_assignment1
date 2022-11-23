import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int id;
        String tmp = "";


        outer:while (true) {
            System.out.println("input name, id");
            name = scanner.next();
            id = scanner.nextInt();
            if (id == -1) {
                System.out.println("Thank You come again");
                break;
            }
            while (!isBalanced(id)) {
                System.out.println("INVALID ID TRY AGAIN");
                id = scanner.nextInt();
                if (id == -1) {
                    System.out.println("Thank You come again");
                    break outer;
                }

            }


            while (true) {
                int selection;
                menu();
                selection = scanner.nextInt();
                if (selection == 1) {
                    int ans = solveEquation();
                    System.out.println(ans);
                }
                else if (selection == 2) {
                    findEquationRoots();

                }
                else if (selection == 3) {
                    combineEquations();
                }
                else if (selection == 4) {
                    break;
                }
                else {
                    System.out.println("INVALID INPUT\ntry again");

                }

            }


        }


    }

    //METHOD #1
    static boolean  isBalanced(int id) {
        String tmp = Integer.toString(id);

        int evenCounter = 0, oddCounter = 0;

        // 7 it's a char -> ascii code '7' -'0'

        if (((tmp.charAt(0) - '0') % 2) == 0) {
            evenCounter += tmp.charAt(0) - '0';
        }
        else {
            oddCounter += tmp.charAt(0) - '0';
        }

        for (int i = 1; i < tmp.length(); i++) {
            if (tmp.charAt(i) == tmp.charAt(i - 1)) {
                return false;
            }

            if (((tmp.charAt(i) - '0') % 2) == 0) {
                evenCounter += tmp.charAt(i) - '0';
            }
            else {
                oddCounter += tmp.charAt(i) - '0';
            }


        }

        return (evenCounter == oddCounter);


    }

    static void menu() {
        System.out.println("===============================================");

        System.out.println("1- Solve any quadratic equation by entering the value of x as well as the values of the\n" +
                "coefficients (a,b,c) of the equation." +
                "\n2-Find the root values of any given quadratic equation entered as in item 1 above (only\n" +
                "coefficients entered and no x) ." +
                "\n3- Combine any two quadratic equations with the same x value(s) into one equation" +
                "\n4- Exit menu." +
                "");

        System.out.println("===============================================");
    }

    // U MIGHT NEED TO USE DOUBLE  FOR ALL PARTS, HERE I DIDN'T DO FOR ALL

        static int solveEquation() {
        Scanner scanner = new Scanner(System.in);

        int a, b, c, x;
        System.out.println("input a, b, c , and x respectively");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        x = scanner.nextInt();
        return ((a * x * x) + (b * x) + c);

    }

    static void combineEquations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input: a1,b1,c1");

        int a1, b1, c1;
        a1 = scanner.nextInt();
        b1 = scanner.nextInt();
        c1 = scanner.nextInt();

        int a2, b2, c2;
        System.out.println("input: a2,b2,c2");
        a2 = scanner.nextInt();
        b2 = scanner.nextInt();
        c2 = scanner.nextInt();
        System.out.println(a1 + a2 + "x2 + " + (b1 + b2) + "x + " + (c2 + c1));


    }

    static void findEquationRoots() {
        Scanner scanner = new Scanner(System.in);

        // value a, b, and c
        System.out.println("input: a, b, c");
        double a, b, c;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        double root1, root2;

        // calculate the determinant (b2 - 4ac)
        double determinant = b * b - 4 * a * c;

        // check if determinant is greater than 0
        if (determinant > 0) {

            // two real and distinct ro
            //
            // ots
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.printf("root1 = %.2f and root2 = %.2f \n", root1, root2);

        }

        // check if determinant is equal to 0
        else if (determinant == 0) {

            // two real and equal roots
            // determinant is equal to 0
            // so -b + 0 == -b
            root1 = root2 = -b / (2 * a);
            System.out.printf("root1 = root2 = %.2f;", root1);
        }

        // if determinant is less than zero
        else {
            // roots are complex number and distinct
            double real = -b / (2 * a);

            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.printf("root1 = %.2f+%.2fi", real, imaginary);   // 1 + 5i
            System.out.printf("\nroot2 = %.2f-%.2fi", real, imaginary);

        }

    }
}