package org.example;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {

        Person father = new PersonBuilder()
                .nAme("Фёдор")
                .surName("Смирнов")
                .age(40)
                .address("Вологда")
                .build();
        father.happyBirthday();

        Person son = father.newChildBuilder()
                .nAme("Антошка")
                .age(8)
                .build();
        son.happyBirthday();
        System.out.println(father.toString() + '\n' + son.toString());


    }
}
