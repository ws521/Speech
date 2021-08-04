package com.fc.test;

public interface UserFactory {
    Student get(String name);

    default String dea() {
    return "";

    }
}
