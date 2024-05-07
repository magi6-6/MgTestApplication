package com.mg.jvm.test;

import java.util.ArrayList;
import java.util.List;

public class TestJvm {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();

        long i = 1;
        while (true) {
            list.add(i++);
        }

    }
}
