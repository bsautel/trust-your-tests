package fr.fierdecoder.trustyourtests;

public class PersonReader {
    public Person readPerson() {
        Person person = new Person("Uncle", "Bob");
        System.out.println("Created person " + person.getFirstName() + " " + person.getLastName());
        return person;
    }
}
