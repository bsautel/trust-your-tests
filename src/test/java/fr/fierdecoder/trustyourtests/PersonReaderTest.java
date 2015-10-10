package fr.fierdecoder.trustyourtests;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonReaderTest {
    @Test
    public void shouldReadUncleBob() {
        PersonReader personReader = new PersonReader();

        Person person = personReader.readPerson();

        assertThat(person.getFirstName()).isEqualTo("Uncle");
    }
}