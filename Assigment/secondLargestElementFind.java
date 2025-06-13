package Assigment;

import java.util.ArrayList;

public class secondLargestElementFind {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(23);
        number.add(3);
        number.add(9);

        if(number.size() < 2){
            System.out.println("element cannot find!!");
            return;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : number) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("All elements are the same or only one unique value exists.");
        } else {
            System.out.println("Second largest number is: " + secondLargest);
        }
    }
    }

