package org.example;

import java.sql.SQLOutput;

public class ExceptionCommon {


    public static void main(String[] args) {

        System.out.println(9/3);
        try {
            System.out.println(9 / 0);

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());


        } finally {
            System.out.println("finally");

        }

        try {
            System.out.println(9/0);
        } catch (Exception e) {
            System.out.println((e.getMessage()));
        }
    }

    public void pause() {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }

    public static int delimetr (int i, int b)  {
        int res = 0;
        try {
          res =  i/b;
        } catch (Exception e) {
            e.getMessage();
        }
        return res;

    }
}

