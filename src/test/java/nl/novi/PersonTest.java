package nl.novi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

  private Person person;

  @BeforeEach
  void setUp() {
    person = new Person();
  }


//  @Test
//  void person() {
//    //arrange
//    var firstName = "Maarten";
//    var lastName = "Postma";
//    //act
//    person.setFirstName(firstName);
//    person.setLastName(lastName);
//    person(firstName);
//    //assert
//    assertEquals(firstName, person.getFirstName());
//    assertEquals(lastName, person.getLastName());
//  }

//  @Test

  @Test
  void canCreateWithConstructorWithSignature() {
    // arrange
    var myTestUser = new Person("Maarten");

    // act

    // assert
    assertEquals("Maarten", myTestUser.getName());
  }

  @Test
  void canCreateSetName() {
    // arrange
    var name = "Maarten";

    // act
    person.setName(name);

    // assert
    assertEquals(name, person.getName());
  }
  @Test
  void canCreateGetLastName() {
    // arrange
    var lastName = "Postma";
    person.setLastName(lastName);

    // act
    var sut = person.getLastName();

    // assert
    assertEquals(lastName, sut);
  }
}