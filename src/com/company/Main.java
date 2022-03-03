package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) { // упр.5
            System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        {
            String w = ("       ");  // упр.6
            String s = ("*");
            for (int i = 1; i <= 5; i++) {
                if (i == 1) {
                    System.out.println(s + w);
                } else if (i == 2) {
                    System.out.println(s + w + s);
                } else if (i == 3) {
                    System.out.println(s + w + s + w + s);

                } else if (i == 4) {
                    System.out.println(s + w + s + w + s + w + s);
                }
                else if (i == 5) {
                    System.out.println(s + w + s + w + s + w + s + w + s);
                }
            }

        }

                int  i = 1;  // упр.7
                int  a;
                      while (i <= 10) {
                    System.out.print(i + " + 3 = ");
                    System.out.println(i * 3);
                    i++;

    }

    }
}















