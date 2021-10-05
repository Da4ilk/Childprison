package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;

public class Parent {
    private int age;
    private String name;
    private Set<Children> childrens;

    public void setAge(int age) {
        if (age > 17 || age < 101) {
            this.age = age;
            System.out.println("Возраст родителя: " + age);
        } else {
            System.out.println("Ошибка");// Почитать про exception, и вместо sout возвращать ошибку через слова throws.
        }
    }
    public void setName(String  name){
        this.name=name;
        System.out.println("Имя родителя: "+name);
    }
    public void setChildrens(Set<Children> childrens) {
        this.childrens = childrens;
    }
    public int getAge (){
        return  this.age;
    }
    public String getName(){
        return this.name;
    }
    public Set<Children> getChildrens (){
        return this.childrens;
    }
    public Set<Children> getChildrenByGroupId(int id){
        childrens.stream().  //найти детей,у который id совпадает с номером группы!

    }


    public void addChildren(Children children){
        if (!(childrens.contains(children))){
         childrens.add(children);
        } else {
            System.out.println(" Этот ребёнок уже есть ");
        }

    }

    @Override
    public String toString() {
        return "Parent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", childrens=" + childrens +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parent parent = (Parent) o;
        return age == parent.age && Objects.equals(name, parent.name) && Objects.equals(childrens, parent.childrens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, childrens);
    }

}
