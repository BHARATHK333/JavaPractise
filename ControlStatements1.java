package com.amdocs1;

import java.util.ArrayList;
import java.util.Arrays;

public class ControlStatements1 {
    public static void main(String[] args) {
        ArrayList<Integer> array =  new ArrayList<Integer>(Arrays.asList(1, 2, 4, 4, 7, 3, 2));
        ArrayList<Integer> duplicateArray = new ArrayList<Integer>();


        for (Integer x: array) {
            int j=0;
            System.out.println("In the outer for loop");
            if(duplicateArray.isEmpty()){
                duplicateArray.add(x);
                continue;
            }
            for(j=0;j<duplicateArray.size();j++){
                System.out.println("In the inner for loop");
                if (duplicateArray.get(j) == x) {
                    System.out.println("In the if block");
                    break;
                }
            }
          if(j==duplicateArray.size()){
              duplicateArray.add(x);
          }
        }

        for (Integer z: duplicateArray) {
            System.out.println(z);
        }
    }
}
