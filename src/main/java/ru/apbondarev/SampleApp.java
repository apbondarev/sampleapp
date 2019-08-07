package ru.apbondarev;

import java.util.function.Supplier;

import com.google.common.base.Strings;

public class SampleApp {

    private static class InnerClass {
        private final int value;

        private InnerClass(int value) {this.value = value;}

        public int getValue() {
            return value;
        }
    }

    public String hello() {
        InnerClass innerClass = new InnerClass(1);
        String name = Strings.repeat("a", innerClass.getValue());
        Supplier<String> supplier = () -> String.format("Hello %s!", name);
        return supplier.get();
    }
}
