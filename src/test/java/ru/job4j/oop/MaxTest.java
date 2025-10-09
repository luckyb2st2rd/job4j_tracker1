package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {
    @Test
    void whenMax1Then1() {
        int a = 4;
        int b = 2;
        int c = 3;
        int d = 1;
        int expected = 4;
        int out = Max.max(a, b, c, d);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenMax2Then2() {
        int a = -1;
        int b = 2;
        int c = -3;
        int d = 1;
        int expected = 2;
        int out = Max.max(a, b, c, d);
        assertThat(out).isEqualTo(expected);
    }

}