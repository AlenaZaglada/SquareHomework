package ru.netology.sqr;

public class SQRService {
    public int calc(int min, int max) {
        int result = 0;

        int i;
        for (i = 10; i < 100; i++); {
            int iSquare = i * i;
            if (iSquare >= min) {
                if (iSquare <= max) {
                    result++;
                }
            }
        }
        return result;

    }


}
