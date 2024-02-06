package main.java.com.demo.project;

public class Employee {
    private int age;
    private String gender;
    private String name;
    private String id;
    private String address;

    public Employee() {
    }

    public Employee(int age, String gender, String name, String id, String address) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void celebrateBirthday(){
        this.age++;
    }
}
