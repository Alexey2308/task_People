package org.example;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected Integer age;
    protected String city;

    public PersonBuilder nAme(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder surName(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder address(String city) {
        this.city = city;
        return this;
    }

    public Person build() throws IllegalAccessException {
        Person person;
        if (name == null || name.isEmpty()) {
            throw new IllegalStateException("Некорректный ввод имени, либо фамилии!!!");
        }
        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("Некорректный ввод фамилии!!!!");
        }
        if (age < 0) {
            throw new IllegalStateException("Некорректный ввод возраста!!!");
        }

        person = new Person(name, surname, age);
        person.setAddress(city);

        return person;
    }
}

