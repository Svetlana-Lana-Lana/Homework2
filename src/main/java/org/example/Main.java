package org.example;

/**
 * В качестве домашнего задания вы должны самостоятельно реализовать паттерн Компоновщик и покрыть его тестами.
 * Вам необходимо:
 * 1. Создать свой Java Maven проект;
 * 2. Добавить библиотеки JUnit;
 * 3. Самостоятельно реализовать прикладную задачу;
 * 4. Покрыть проект тестами;
 * 5. Использовать абстрактные классы;
 * 6. Использовать параметризованные тесты;
 * 7. Использовать ЖЦ тестов;
 * 8. Написать негативные тесты;
 * 9. Запушить проект в GIT и прислать ссылку.
 */


public class Main {
    public static void main(String[] args) {

        Group group1 = new Group("11МНвБ");
        Group group2 = new Group("23МдБ");
        Group group3 = new Group("41БзП");
        Group group4 = new Group("32БдП");



        Student infoStudent1 = new Student("Тучин Сергей Викторович.docx");
        Student infoStudent2 = new Student("Вьюжина Наталья Викторовна.docx");
        Student infoStudent3 = new Student("Снежинкина Снежана Сергеена.docx");
        Student infoStudent4 = new Student("Слякоть Николай Николаевич.docx");
        Student infoStudent5 = new Student("Морозов Игорь Иванович.docx");
        Student infoStudent6 = new Student("Снегушкина Екатерина Ивановна.docx");
        Student infoStudent7 = new Student("Сугробов Степан Игоревич.docx");
        Student infoStudent8 = new Student("Проталина Мария Петровна.docx");
        Student infoStudent9 = new Student("Настова Анастасия Станиславовна.docx");

        //group1.addComponent(group3);
        group1.addComponent(infoStudent1);
        group1.addComponent(infoStudent2);
        group1.addComponent(infoStudent3);



        //group2.addComponent(group1);
        group2.addComponent(infoStudent4);
        group2.addComponent(infoStudent5);
        group2.addComponent(infoStudent6);

        //group3.addComponent(group2);
        group3.addComponent(infoStudent7);
        group3.addComponent(infoStudent8);
        group3.addComponent(infoStudent9);




        group1.showInfo();
        group2.showInfo();
        group3.showInfo();

        group3.removeComponent(infoStudent9);
        group3.showInfo();
        group3.removeComponent(infoStudent8);
        group3.removeComponent(infoStudent7);
        group3.showInfo();
        group4.showInfo();




    }
}
