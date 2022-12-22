import src.Gender;

import java.time.LocalDate;

public class Order {
    private Long id;
    private String name;
    private String surName;
    private Gender gender;
    private LocalDate age;
    private String number;

    public Order(Long id, String name, String surName, Gender gender, LocalDate age, String number) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.age = age;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", number='" + number + '\'' +
                "\n";
    }
}
