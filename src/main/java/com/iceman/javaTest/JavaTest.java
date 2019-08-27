package com.iceman.javaTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class JavaTest {

    public static void main(String[] ss) {
        try {

            Scanner scanner = new Scanner(System.in);
            StringBuilder sb = new StringBuilder();
            while(scanner.hasNext()){
                sb.append(scanner.nextLine());
                sb.append("***");
            }
            LinkedList<String> linkedList = new LinkedList<String>();
            linkedList.add("aa");
            linkedList.get(9);
            linkedList.iterator();
            HashMap
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))
            System.out.println(sb.toString());
            String[] strs = new String[3];
            System.out.println(strs[5]);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println("ssss");
            System.out.println(e.getMessage());
        }
    }
}
