package com.company.homework.third;

public class LotteryTicket {
    private static int counter = 1;

    public int checkLuck() {
        int prize = 0;
        if (counter % 10 == 0) {
            prize = 100;
        }
        if (counter % 100 == 0) {
            prize = 5000;
        }
        counter++;
        return prize;
    }
}
