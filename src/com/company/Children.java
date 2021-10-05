package com.company;

import java.util.Set;
/*

Описать класс дети,внести в него гетеры и сеттеры,конструктор (хэш,стринга,иклс).
Стримы
*/
public class Children {
    private int  age;
    private String name;
    private Group group;
    private Set<Parent> parents;// не больше 2 родителей.
    private int numberInGroup;// номер ребёнка в группе, в которой он находится.
    private int id;
    public static int count;

     public Children (){
         this.id=count++;
     }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setParents(Set<Parent> parents){
        this.parents=parents;
    }


    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public Set<Parent> getParents(){
        this.parents=parents;
    }


}
