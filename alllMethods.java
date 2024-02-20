package Methods;
import java.util.Scanner;




public class alllMethods {


    void H(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || j == size - 1 || i == size / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    void A() {
        int size = 5;  // Adjust the size as needed

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= size + i; j++) {
                if (j == size - i || j == size + i || i == size / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    void B() {
        int size = 5;  // Adjust the size as needed

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= size / 2; j++) {
                if ((j == 0) || (j == size / 2 && (i != 0 && i != size - 1)) || ((i == 0 || i == size - 1) && j < size / 2)
                        || (i == size / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    void C() {
        int size = 5;  // Adjust the size as needed

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((j == 0 && i > 0 && i < size - 1) || ((i == 0 || i == size - 1) && j > 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    void D() {
        int size = 5;  // Adjust the size as needed

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= size / 2; j++) {
                if ((j == 0) || (j == size / 2 && (i != 0 && i != size - 1))
                        || ((i == 0 || i == size - 1) && j < size / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    void E() {
        int size = 5;  // Adjust the size as needed

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || i == 0 || i == size - 1 || (i == size / 2 && j <= size / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    void F() {
        int size = 5;  // Adjust the size as needed

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || i == 0 || (i == size / 2 && j <= size / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    void G() {
        int size = 5; // Adjust the size as needed

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == 0 || i == size - 1) && (j > 0 && j < size - 1)) {
                    System.out.print("*");
                } else if (j == 0 && i != 0 && i != size - 1) {
                    System.out.print("*");
                } else if (j == size - 1 && (i > 0 && i < size - 1)) {
                    System.out.print("*");
                } else if (i == size / 2 && j > size / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void I() {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == size / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void J() {
        int size = 5;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || j == size / 2 || (i == size - 1 && j <= size / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void K() {
        System.out.println("*   *");
        System.out.println("*  *");
        System.out.println("* *");
        System.out.println("*  *");
        System.out.println("*   *");
    }

    void L() {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || i == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void M() {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || j == size - 1 || (i == j && i <= size / 2) || (i + j == size - 1 && i <= size / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    void N() {
        int size = 5;  // Adjust the size as needed

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || j == size - 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    void O() {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == 0 || i == size - 1) && (j > 0 && j < size - 1)) {
                    System.out.print("*");
                } else if ((j == 0 || j == size - 1) && (i > 0 && i < size - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void P() {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || (i == 0 && j < size / 2) || (i == size / 2 && j < size / 2) || (i > 0 && i < size / 2 && j == size / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void Q() {
        System.out.println("* * * * *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*     * *");
        System.out.println("* * * * *");
        System.out.println("         *");


    }

    void R(){
        int size = 5; // Size of the pattern

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                // Print '*' for the first and last columns
                if (j == 0 || (i == 0 || i == size / 2) && j < size - 1
                        || (j == size - 1 && i <= size / 2 && i > 0) || i - j == size / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    void S(){
        int size = 5; // Size of the pattern

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                // Print '*' for the first and last rows and columns
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("*");
                } else if (i <= size / 2 && j == 0) {
                    // Print '*' for the top-left part of 'S'
                    System.out.print("*");
                } else if (i == size / 2 && j <= size / 2) {
                    // Print '*' for the middle horizontal line of 'S'
                    System.out.print("*");
                } else if (i == size - 1 && j >= 0 && j < size / 2) {
                    // Print '*' for the bottom-left part of 'S'
                    System.out.print("*");
                } else {
                    // Print a space for other positions
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    void T(){
        int size = 5; // Size of the pattern

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                // Print '*' for the first row and the middle column
                if (i == 0 || j == size / 2) {
                    System.out.print("*");
                } else {
                    // Print a space for other positions
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    void U(){
        int size = 5; // Size of the pattern

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                // Print '*' for the first and last columns
                if ((j == 0 || j == size - 1) && i < size - 1) {
                    System.out.print("*");
                } else if (i == size - 1 && (j > 0 && j < size - 1)) {
                    // Print '*' for the bottom line of 'U'
                    System.out.print("*");
                } else {
                    // Print a space for other positions
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    void V(){
        System.out.println("*           *");
        System.out.println(" *         *");
        System.out.println("  *      *");
        System.out.println("   *   *");
        System.out.println("     *   ");
    }

    void W(){
        int size = 5; // You can adjust the size as needed

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || j == size - 1 || (i + j == size - 1 && j <= size / 2) || (i == j && j >= size / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    void X(){
        int size = 5; // Size of the pattern

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                // Print '*' for the positions where i equals j or i equals (size - j - 1)
                if (i == j || i == size - j - 1) {
                    System.out.print("*");
                } else {
                    // Print a space for other positions
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    void Y(){
        int size = 5; // Size of the pattern

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                // Print '*' for the positions where (i equals j or i equals size - j - 1) and i is less than size / 2
                if ((i == j || i == size - j - 1) && i < size / 2) {
                    System.out.print("*");
                } else if (j == size / 2 && i >= size / 2) {
                    // Print '*' for the middle column when i is greater than or equal to size / 2
                    System.out.print("*");
                } else {
                    // Print a space for other positions
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    void Z(){
        int size = 5; // Size of the pattern

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                // Print '*' for the first and last rows and the diagonal line
                if (i == 0 || i == size - 1 || i + j == size - 1) {
                    System.out.print("*");
                } else {
                    // Print a space for other positions
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

}

