package org.example._2023_11_13.ann;

import org.example._2023_09_06.Person;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface OperationSystem {
    String operationSystem() default "Android";
    int year() default 2023;
}

@OperationSystem
class TestA {}

@OperationSystem(operationSystem = "IOS", year = 2022)
class TestB {}
