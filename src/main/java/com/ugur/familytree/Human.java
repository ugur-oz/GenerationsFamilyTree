package com.ugur.familytree;

public class Human {
    private int age;
    private String name;
    private Human mother;
    private Human father;
//generasyonu belirlemek icin sadece anne veya baba olsa yeter simdi onun metodunu yazacagiz

    public int getGenerationCount() {
        //wir haben keine Mutter und Vater
        if (this.mother == null && this.father == null) {
            return 1;
            // Wir haben Mutter und Mutter
        } else if (this.mother != null && this.father != null) {
            int ancestorsMother = this.mother.getGenerationCount();
            int ancestorsFather = this.father.getGenerationCount();
            if (ancestorsMother < ancestorsFather) {
                return 1 + ancestorsFather;
            } else {
                return 1 + ancestorsMother;
            }
            //Wir habe keine Mutter aber einen Vater
        } else if (this.mother == null && this.father != null) {
            return 1 + this.father.getGenerationCount();
        } else {
            //wir haben eine mutter aber keinen vater
            return 1 + this.mother.getGenerationCount();
        }


    }

    public Human(int age, String name, Human mother, Human father) {
        this.age = age;
        this.name = name;
        this.mother = mother;
        this.father = father;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }
}
