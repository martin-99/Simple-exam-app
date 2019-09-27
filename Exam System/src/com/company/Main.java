package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        String question[] = {
          "Колко цвята има в бългорското знаме?",
                "1) Три",
                "2) Четири",
                "3)Пет",
                "4) Не знам",
                "1"
        };
        int points = 0;


        boolean isYes = true;

        while (isYes){
            System.out.println("Would you like to start? Type: Y for Yes or N for No");
            System.out.printf("Your answer is: ");
            String start = scan.nextLine().toUpperCase();
            if (start.equals("Y")) {
                isYes = true;
                for (int i = 0;i<question.length;i++) {
                    System.out.println(question[i]);
                }
                System.out.println("Избери верния отговор от 1 до 4");
                String answer = scan.nextLine();
                if (answer.equals(question[5])) {
                    System.out.println("Поздравления , правилен отговор");
                    points+= 1;
                    System.out.println("Твоите точки са " + points);
                }
            }
            else {
                isYes = false;
            }

        }
    }
}
