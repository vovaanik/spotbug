package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {


    StatsService service = new StatsService();
    int[] expectedArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldSum() {

        int expected = 180;
        int actual = service.sum(expectedArray);

        assertEquals(expected, actual);


    }
}