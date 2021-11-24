package com.ugur.familytree;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HumanTest {
    @Test
    void test1() {
        Human son = new Human(12, "Anton");
        Assertions.assertEquals(1, son.getGenerationCount());
    }

    @Test
    void test2() {
        Human son = new Human(12, "Anton");
        Human mother = new Human(45, "Andrea");
        Human grandmother = new Human(80,"Kaleo");

        son.setMother(mother);
        mother.setMother(grandmother);

        Assertions.assertEquals(3, son.getGenerationCount());
    }

    @Test
    void test3() {
        Human son = new Human(12, "Anton");
        Human mother = new Human(45, "Andrea");
        Human father = new Human(43, "Simon");
        Human grandmother1 = new Human(80, "Walt");
        Human grandfather1 = new Human(80, "Ger");
        Human grandmother2 = new Human(80, "Elfi");
        Human grandfather2 = new Human(80, "Heinz");


        son.setMother(mother);
        son.setFather(father);
        mother.setMother(grandmother1);
        mother.setMother(grandmother2);
        mother.setMother(grandfather1);
        mother.setMother(grandfather2);

        Assertions.assertEquals(3, son.getGenerationCount());
    }

    @Test
    void test5() {
        Human son = new Human(12, "Anton");
        Human mother = new Human(45, "Andrea");
        Human father = new Human(43, "Simon");

        son.setMother(mother);
        son.setFather(father);
        Assertions.assertEquals(2, son.getGenerationCount());
    }
    @Test
    void test6(){
        Human son = new Human(12, "Anton");
        Human mother = new Human(45, "Andrea");
        Human father = new Human(43, "Simon");
        Human grandmother = new Human(80, "Elfi");
        Human grandfather = new Human(80, "Elfi");
        Human greatGrandfather = new Human(97, "Ludwig");
        Human greatGrandmother = new Human(101, "Anna");
        Human greatGreatGrandFather = new Human (170, "Karl");


        son.setMother(mother);
        son.setFather(father);
        father.setMother(grandmother);
        father.setFather(greatGrandfather);
        father.setFather(grandfather);
        grandfather.setMother(greatGrandmother);
        grandfather.setFather(greatGrandfather);
        greatGrandmother.setFather(greatGreatGrandFather);

        Assertions.assertEquals(5, son.getGenerationCount());
    }
}
