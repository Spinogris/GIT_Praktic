package de.telran._30_10_23_UnitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/*
    Задание:
    Придумать несколько тест-кейсов (минимум 3).
    На каждый тест-кейс написать отдельный тестовый метод в данном классе.
    Тестовые методы должны тестировать функционал ArrayService.
     */
class ArrayServiceTest {

  private ArrayService service;

  @BeforeEach
  public void init() {
    service = new ArrayService();
  }

  @Test
  public void checkingArraysSize() {
    Assertions.assertEquals(5, service.getArrayBySize(5).length);
  }

  @Test
  public void CheckingValues() {
    int[] array = service.getArrayBySize(5);
    Assertions.assertEquals(2, array[1]);
    Assertions.assertEquals(2, service.getArrayBySize(5)[1]);
    Assertions.assertEquals(4, service.getArrayBySize(5)[3]);
    Assertions.assertEquals(5, service.getArrayBySize(5)[4]);
  }

  @Test
  public void checkingNotNull() {

  }


}