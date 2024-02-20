package Methods;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {

        alllMethods m=new alllMethods();

        System.out.println("welcome to name pattern");
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name : ");
        String name=sc.nextLine().toUpperCase();

        for (int i=0; i<name.length(); i++){
            char ch=name.charAt(i);

            switch (ch){
                case 65:{
                    m.A();
                    System.out.println();
                    break;

                }
                case 66:{
                    m.B();
                    System.out.println();
                    break;
                }
                case 67:{
                    m.C();
                    System.out.println();
                    break;
                }
                case 68:{
                    m.D();
                    System.out.println();
                    break;

                }
                case 69:{
                    m.E();
                    System.out.println();
                    break;
                }
                case 70:{
                    m.F();
                    System.out.println();
                    break;
                }
                case 71:{
                    m.G();
                    System.out.println();
                    break;
                }
                case 72:{
                    m.H(5);
                    System.out.println();
                    break;
                }
                case 73:{
                    m.I();
                    System.out.println();
                    break;
                }
                case 74:{
                    m.J();
                    System.out.println();
                    break;
                }
                case 75:{
                    m.K();
                    System.out.println();
                    break;
                }
                case 76:{
                    m.L();
                    System.out.println();
                    break;
                }
                case 77:{
                    m.M();
                    System.out.println();
                    break;
                }
                case 78:{
                    m.N();
                    System.out.println();
                    break;
                }
                case 79:{
                    m.O();
                    System.out.println();
                    break;
                }
                case 80:{
                    m.P();
                    System.out.println();
                    break;
                }
                case 81:{
                    m.Q();
                    System.out.println();
                    break;
                }
                case 82:{
                    m.R();
                    System.out.println();
                    break;
                }
                case 83:{
                    m.S();
                    System.out.println();
                    break;
                }
                case 84:{
                    m.T();
                    System.out.println();
                    break;
                }
                case 85:{
                    m.U();
                    System.out.println();
                    break;
                }
                case 86:{
                    m.V();
                    System.out.println();
                    break;
                }
                case 87:{
                    m.W();
                    System.out.println();
                    break;
                }
                case 88:{
                    m.X();
                    System.out.println();
                    break;
                }
                case 89:{
                    m.Y();
                    System.out.println();
                    break;
                }
                case 90:{
                    m.Z();
                    System.out.println();
                    break;
                }
                default:{
                    for (int j=0;j<5; j++){
                        System.out.println();
                    }
                }

            }

        }

    }
}
