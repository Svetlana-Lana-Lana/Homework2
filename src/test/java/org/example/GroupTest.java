package org.example;

import org.junit.jupiter.api.*;

public class GroupTest {

    private static int testNumber = 0;

    //Вывод фразы о начале тестирования класса
    @BeforeAll
    static void init() {
        System.out.println("Запуск тестов класса Group");
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
        System.out.println("Тесты класса Group завершены");
    }

    //Папке с группой присваивается название
    @Test
    void testGroupHasName() {

        //given
        Group group = new Group("TestGroup");

        //when

        //then
        //Assertions.assertNotNull(group.getName());
        Assertions.assertEquals("TestGroup", group.getName());
    }

    //Файл с информацией о студенте добавляется в папку группы
    @Test
    void testGroupAddStudentFile(){

        //given
        Group group = new Group("TestGroup");
        Student student = new Student ("TestStudent.docx");

        //when
        group.addComponent(student);

        //then
        Assertions.assertNotNull(group);
    }

    //При добавлении трех файлов с информацией о студентах,
    // все 3 файла попадают в папку группы
    @Test
    void testGroupAddThreeStudentFiles(){

        //given
        Group group = new Group("TestGroup");
        Student student1 = new Student ("TestStudent1.docx");
        Student student2 = new Student ("TestStudent2.docx");
        Student student3 = new Student ("TestStudent3.docx");

        //when
        group.addComponent(student1);
        group.addComponent(student2);
        group.addComponent(student3);

        //then
        Assertions.assertEquals(3, group.getComponents().size());
    }

    //При удалении файла с информацией о студентах, количество файлов изменяется соответственно
    @Test
    void testGroupremoveStudentFile(){

        //given
        Group group = new Group("TestGroup");
        Student student1 = new Student ("TestStudent1.docx");
        Student student2 = new Student ("TestStudent2.docx");
        Student student3 = new Student ("TestStudent3.docx");

        //when
        group.addComponent(student1);
        group.addComponent(student2);
        group.addComponent(student3);
        group.removeComponent(student2);

        //then
        Assertions.assertEquals(2, group.getComponents().size());
    }

    //Невозможно удалить файл с информацией о студенте из пустой папки
    @Test
    void testRemoveStudentFileFromEmptyGrpup(){

        //given
        Group group = new Group("TestGroup");
        Student student = new Student("TestStudent.docx");

        //when
        //group.addComponent(student);

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () ->group.removeComponent(student));
    }





}
