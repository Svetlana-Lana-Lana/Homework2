package org.example;

class Student implements IComponent {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void showInfo() {
        System.out.println("Студент: " + name);
    }


}
