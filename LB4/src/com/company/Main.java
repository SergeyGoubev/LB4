package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static void MyTask5() {
        System.out.println("Enter count of points");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList list = new ArrayList();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter x,y");
            list.add(new Point(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(list);
        list.forEach((obj) -> {
            System.out.println(obj.toString());
        });
    }

    public static void main(String[] args) {
        MyTask5();
        // TODO code application logic here
    }

}
