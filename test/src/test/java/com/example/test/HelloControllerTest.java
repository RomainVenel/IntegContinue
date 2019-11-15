package com.example.test;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class HelloControllerTest {
    @Test
    void testIndex() {
        HelloController helloController = new HelloController();

        String resultIndex = helloController.index();

        assertThat(resultIndex).isEqualTo("Hello !!");
    }
}
