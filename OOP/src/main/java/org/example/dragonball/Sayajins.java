package org.example.dragonball;

public class Sayajins {
    private String bornWithTail;
    private String hairColor;
    private int transformationsSsj;

    public Sayajins(String name, String bornWithTail, String hairColor, int transformationsSsj, int age) {
        this.name = name;
        this.bornWithTail = bornWithTail;
        this.hairColor = hairColor;
        this.transformationsSsj = transformationsSsj;
        this.age = age;
    }

    public String introduce() {
        return "Hola, soy " + this.name + ". Tengo " + this.age + " años en el segundo dragon ball (Z) :P La verdad es que: " + bornWithTail + " tengo una cauda, y el color de mi pelo es " + hairColor + ". Puedo transformarme " + transformationsSsj + "x en SSJ!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBornWithTail() {
        return bornWithTail;
    }

    public void setBornWithTail(String bornWithTail) {
        this.bornWithTail = bornWithTail;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getTransformationsSsj() {
        return transformationsSsj;
    }

    public void setTransformationsSsj(int transformationsSsj) {
        this.transformationsSsj = transformationsSsj;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
