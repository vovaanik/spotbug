package ru.netology.stats;

public class StatsService {
    public int sum(int[] array) {
        int result = 0;
        for (int amount : array) {
            result += amount;
        }
        return result;
    }
}