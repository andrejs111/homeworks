package io.codelex.classesandobjects.practice.Exercise7;

public class Dog {
    private String name;
    private String sex;
    private Dog mother;
    private Dog father;;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void setParent(Dog mother, Dog father) {
        this.mother = mother;
        this.father = father;
    }
    public void mothersName() {
        if (this.mother != null) {
            System.out.println("Mother: " + this.father + ".");
        } else {
            System.out.println("Mother: unknown.");
        }
    }

    public void fathersName() {
        if (this.father != null) {
            System.out.println("Father: " + this.father + ".");
        } else {
            System.out.println("Father: unknown.");
        }
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        if (this.mother != null && this.mother == otherDog.mother) {
            System.out.println("Same mother: " + this.mother);
            return true;
        }
        System.out.println("Different mothers: " + this.mother + "  " + otherDog.mother);
        return false;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", mother=" + (mother != null ? mother.name : "Unknown") +
                ", father=" + (father != null ? father.name : "Unknown") +
                '}';
    }
}

