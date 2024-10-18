package Test;

import isen.library.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person person;

    @BeforeEach
    void Person() {
        person = new Person();
    }

    @Test
    void constructor() {
        assertEquals("unknown", person.getName());
        assertEquals(22, person.getYears());
    }

    @Test
    void getName() {
        assertEquals("unknown", person.getName());
    }

    @Test
    void setName() {
        person.setName("John");
        assertEquals("John", person.getName());
    }

    @Test
    void getYears() {
        assertEquals(22, person.getYears());
    }

    @Test
    void setYears() {
        person.setYears(30);
        assertEquals(30, person.getYears());
    }
}