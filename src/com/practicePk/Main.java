package com.practicePk;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner1.nextInt();

        System.out.print("Annual Interest Rate (%): ");
        float annualInterest = scanner1.nextFloat();
        float monthlyInterest = (annualInterest/PERCENT)/MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        int periodYear = scanner1.nextInt();
        int periodMonth = periodYear*12;

        double mortgage = principal*((monthlyInterest*(Math.pow(1+monthlyInterest, periodMonth)))/
                (Math.pow(1+monthlyInterest, periodMonth)-1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+mortgageFormatted);



    }
}
