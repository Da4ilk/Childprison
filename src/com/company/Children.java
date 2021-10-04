package com.company;

import java.util.Set;
/*

Описать класс дети,внести в него гетеры и сеттеры,конструктор (хэш,стринга,иклс).

*/
public class Children {
    int  age;
    String name;
    Group group;
    Set<Parent> parents;// не больше 2 родителей
    int numberInGroup;// номер ребёнка в группе, в которой он находится
    int id; // номер  ребёнка среди всех групп

}
