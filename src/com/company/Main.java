package com.company;

public class Main {

    public static void main(String[] args) {
        //основной код который ты будешь писать
        double[] doubles = {1.2,3.5,4.4,5.6,-3.4,-6.5,6.6,7.8,-4.5,10.9,-24.2,45.7,-32.4,-12.4,9.6};

        double summa = 0;
        double koli = 0;
        boolean isOtr = false;
        for (double crArif : doubles) {
            if (crArif < 0) {
                isOtr = true;
            } else {
                if (isOtr) {
                    koli++;
                    summa += crArif;}
    }
 }
        System.out.println(summa/koli);

    }

}
