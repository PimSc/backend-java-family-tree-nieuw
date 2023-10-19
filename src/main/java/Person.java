import java.util.ArrayList;

public class Person {

    private String name;
    private String middleName;
    private String lastName;
    private char sex;
    private int age;
    private Person mother;
    private Person father;
    private ArrayList<Person> siblings = new ArrayList<>();
    private ArrayList<Person> children = new ArrayList<>();
    private ArrayList<Pet> pets = new ArrayList<>();

    public Person(String name, String lastName, int age, char sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, String middleName, String lastName, int age, char sex) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public void addParents(Person mother, Person father) {
        this.mother = mother;
        this.father = father;
    }

    public ArrayList<Person> getGrandChildren() {
        ArrayList<Person> grandChildren = new ArrayList<>();
        for (Person child : children) {
            grandChildren.addAll(child.getChildren());
        }
        return grandChildren;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void addSibling(Person sibling) {
        siblings.add(sibling);
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public void addPet(Pet pet) {
        pets.add(pet);


    }
}