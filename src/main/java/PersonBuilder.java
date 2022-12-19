import java.util.OptionalInt;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.city = address;
        return this;
    }

    public Person build() {
        if (age < 0) {
            throw new IllegalArgumentException("Некорректный возраст");
        }
        if (name == null || surname == null) {
            throw new IllegalStateException("Не заполнены обязательные поля");
        }

        Person person;
        if (age != 0) {
            person = new Person(name, surname, age);
        } else {
            person = new Person(name, surname);
        }
        person.setAddress(city);
        return person;
    }
}