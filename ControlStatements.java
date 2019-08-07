package com.amdocs1;

import java.io.IOException;

public class ControlStatements {
    public static void main(String[] args) throws IOException {
        char choice;

        do {
            System.out.println("1: if");
            System.out.println("2: Switch");
            System.out.println("3: while");
            System.out.println("Choose one: ");
            choice = (char) System.in.read();


        } while(choice < '1' || choice > '3');

        System.out.println("\n");

        switch (choice){
            case '1':
                System.out.println("if block is executed ");
                break;

            case '2':
                System.out.println("Switch block is executed ");
                break;
            case '3':
                System.out.println("while loop is executed ");
                break;
            default:
                System.out.println("Choose correct choice ");
        }

        int[][] nums = new int[3][5];
        int sum = 0;
        for(int i=0;i<3;i++)
            for(int j=0;j<5;j++)
                nums[i][j] = (i+1)*(j+1);

        for (int x[]: nums) {
            for (int y: x
                 ) {
                sum += y;
            }
        }

        System.out.println("Summation: "+ sum);
    }
}
