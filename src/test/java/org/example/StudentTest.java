package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class StudentTest {
    private static int testNumber;
    //Вывод фразы о начале тестирования класса
    @BeforeAll
    static void init() {
        System.out.println("Запуск тестов класса Student");
        //testNumber = 0;
    }

    //Вывод фразы о начале каждого теста
    @BeforeEach
    void beforeEach() {
        testNumber++;
        System.out.println("Запуск теста " + testNumber);
    }

    //Вывод фразы о завершении каждого теста
    @AfterEach
    void afterEach() {
        System.out.println("Тест " + testNumber + " завершен");
    }

    //Вывод фразы о завершении выполнения тестов класса
    @AfterAll
    static void exit() {
        System.out.println("Тесты класса Student завершены");
    }

    @Test
    void testStudentFileHasName() {

        //given
        Student student = new Student("TestStudent.docx");;

        //when

        //then
        //Assertions.assertNotNull(group.getName());
        Assertions.assertEquals("TestStudent.docx", student.getName());
    }

    //Названия всех файлов с информацией о студентах сохраняются
    @ParameterizedTest
    @ValueSource(strings = {"student1.docx", "student2.docx", "student3.docx"})
    void testStudentInfoFilesNames(String studentName) {

        // given
        Student student = new Student(studentName);
        // when

        // then
        Assertions.assertEquals(studentName, student.name);
    }
}
