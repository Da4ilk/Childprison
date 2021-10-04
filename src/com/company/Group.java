package com.company;

import java.util.List;
import java.util.Objects;

public class Group {
    private String groupName;
    private int numberGroup;
    private List<Children> childrens;
    private static int countGroup=0;

    public void setGroupName(String groupName){
        this.groupName=groupName;
        System.out.println("Дается такое именя группе: " + groupName);
    }
    public void setNumberGroup(int numberGroup){
        this.numberGroup=numberGroup;
        System.out.println("Номер группы: " + numberGroup);
    }
    public void setChildrens(List<Children> childrens){
        this.childrens=childrens;
        System.out.println("Назначен список детей: " +childrens);
    }
    public String getGroupName() {
        return this.groupName;
    }
    public int numberGroup() {
        return this.numberGroup;
    }
    public List<Children> getChildrens (){
        return this.childrens;
    }
    ////
    public void addChildren (Children children){
        childrens.add(children);
    }
    public Group (String groupName){
        this.groupName=groupName;
        this.numberGroup=countGroup++;
    }


    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", numberGroup=" + numberGroup +
                ", childrens=" + childrens +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return numberGroup == group.numberGroup && Objects.equals(groupName, group.groupName) && Objects.equals(childrens, group.childrens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, numberGroup, childrens);
    }
}
