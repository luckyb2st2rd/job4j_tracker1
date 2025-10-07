package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PointTest {
    @Test
    public void whenX0Y0t0X2Y0Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double result = a.distance(b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenX2Y0toX4Y2Then2() {
        Point a = new Point(2, 0);
        Point b = new Point(2, 6);
        double expected = 6;
        double result = a.distance(b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenX10Y0toX5Y0Then5() {
        Point a = new Point(10, 0);
        Point b = new Point(5, 0);
        double expected = 5;
        double result = a.distance(b);
        assertThat(result).isEqualTo(expected);
    }
}