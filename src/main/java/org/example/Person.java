package org.example;

import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected Integer age;
    protected String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;


    }

    public Person(String name, String surname, int age) {

        this.surname = surname;
        this.name = name;
        this.age = age;
    }


    public void setAddress(String city) {
        if (hasAddress())
            this.city = city;
    }

    protected boolean hasAddress() {
        if (city == null) {
            return true;
        }
        return false;
    }

    public boolean hasAge() {
        return age >= 0;
    }

    public String getname() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getCity() {
        return city;
    }

    public void happyBirthday() {
        if (hasAge()) this.age++;

    }

    @Override
    public String toString() {
        return "Person : " + '\n' +
                "name= " + name + '\n' +
                "surname=" + surname + '\n' +
                "age= " + age + '\n' +
                "address= " + city + '\n';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public PersonBuilder newChildBuilder() throws IllegalAccessException {
        return new PersonBuilder().surName(surname).address(city);


    }


}
