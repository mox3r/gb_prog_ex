package com.example.noobie_lessons;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        boolean LoggedIn = true;
        int day = 1;

        if (a == 5 && LoggedIn) {
            System.out.println("Passed. A = 5");
        } else if (a == 5 && !LoggedIn) {
            System.out.println("Not Passed. Relog or fck off!");
        } else {
            System.out.println("Acces denied");
        }

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Th");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("О чем ты, друг?!");
                break;
        }

        int size = 10;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(0, 1000);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}