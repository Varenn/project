package com.example.proj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class proje {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(reader.readLine());
        for (int i = 1; i <=n ; i++) {
            if (n%i==0) System.out.println(i);

        }

    }

}
