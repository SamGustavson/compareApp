package core.epam.moreAndEqual;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
//        symbols(input);
        String front;
        String nova = input.replace(">", "").replace("<","").replace("=","");

        int nums = Integer.parseInt(nova);

        int[] mass = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        front = input.substring(0, 2);
//
//        if (front.equals(">=")) {
//            for (int i = nums; i <= mass.length; i++) {
//                System.out.print(mass[i] + " ");
//            }
//        }
//        if (front.equals("<=")) {
//            for (int i = 0; i <= nums; i++) {
//                System.out.print(mass[i] + " ");
//            }
//        }

        if(input.startsWith(">")){
            if (input.startsWith(">=")) {
                for (int i = nums; i < mass.length; i++) {
                    System.out.print(mass[i] + " ");
                }
            } else {
                for (int i = nums+1; i < mass.length; i++) {
                System.out.print(mass[i] + " ");
            }

            }
        }
        if (input.startsWith("<")){
            if (input.startsWith("<=")){
                for (int i = 0; i < nums+1; i++) {
                    System.out.print(mass[i] + " ");
                }
            }else {
            for (int i = 0; i < nums; i++) {
                System.out.print(mass[i] + " ");
               }
            }
        }
    }
    
}