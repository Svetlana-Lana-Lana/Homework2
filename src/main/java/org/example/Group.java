package org.example;

import java.util.ArrayList;
import java.util.List;

class Group implements IComponent {
    private String name;
    private List<IComponent> components = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    public List<IComponent> getComponents() {
        return components;
    }

    public String getName() {
        return name;
    }

    public void addComponent(IComponent component) {
        components.add(component);
    }

    public void removeComponent(IComponent component) {
        if (components.contains(component)) {
            components.remove(component);
        } else {
            throw new IllegalArgumentException("В данной группе нет студентов");
        }
    }



    @Override
    public void showInfo() {
        System.out.println("Группа: " + name);
        if (components.isEmpty()) {
            System.out.println("В данной группе нет студентов");
        } else {
            System.out.println("список студентов: ");
            for (IComponent component : components) {
                component.showInfo();
            }
            System.out.println();
        }
    }


}
