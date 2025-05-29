package org.example.dragonball;

public class Human {
    private String itens;
    private String gender;
    private String relationToASayajin;

    public Human(String name, int age, String gender, String itens, String relationToASayajin) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.itens = itens;
        this.relationToASayajin = relationToASayajin;
    }
    public String introduce() {
        return "Hola, soy " + this.name + " y tengo " + this.age +" años en DBZ! Soy " + this.gender + " y no salgo sín mi " + this.itens + ". Soy " + this.relationToASayajin +  " de un Sayajin!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRelationToASayajin() {
        return relationToASayajin;
    }

    public void setRelationToASayajin(String relationToASayajin) {
        this.relationToASayajin = relationToASayajin;
    }
}
