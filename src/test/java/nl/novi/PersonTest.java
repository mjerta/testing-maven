package nl.novi;

import com.sun.security.jgss.GSSUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

  private Person person;

  @BeforeEach
  void setUp() {
    person = new Person();
  }

  @Test
  void canCreateWithConstructorWithSignature() {
    // arrange
    var myTestUser = new Person("Maarten");

    // act

    // assert
    assertEquals("Maarten", myTestUser.getName());
  }

  @Test
  void canCreateGetName() {
    // arrange
    var name = "Maarten";
    person.setName(name);

    // act
    var sut = person.getName();

    // assert
    assertEquals(name, sut);

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
  void canSetlastNameWithParameterWithLowerCase() {
    // arrange
    var lastName = "postma";

    // act
    person.setLastName(lastName);
    var sut = person.getLastName();

    // assert
    assertEquals("Postma", sut);
  }

  @Test
  void canSetlastNameWithParameterWithUpCase() {
    // arrange
    var lastName = "Postma";
    person.setLastName(lastName);

    // act
    var sut = person.getLastName();

    // assert
    assertEquals("Postma", sut);
  }


  @Test
  void canGetAge() {
    // arrange
    var age = 20;
    person.setAge(age);
    // act
    var sut = person.getAge();
    // asset
    assertEquals(age, sut);
  }

  @Test
  void canDoAgeoneYear() {
    // arrange
    var age = 20;
    person.setAge(age);
    // act
    person.ageOneYear();
    // asset
    assertEquals(age+1, person.getAge());
  }

  @Test
  void canGetPartner() {
    // arrange
    Person partner = new Person("Hans");
    person.setPartner(partner);
    // act
    var sut = person.getPartner();
    // asset
    assertEquals(partner, sut);
  }

  @Test
  void canDoHasPartner() {
    // arrange
    Person partner = new Person("Hans");
    person.setPartner(partner);
    // act
    var sut = person.hasPartner();
    // asset
    assertEquals(true, sut);
  }

  @Test
  void canDoHasPartnerFalse() {
    // arrange
    var partner = person.getPartner();
    //act
    var sut = person.hasPartner();
    // asset
    assertEquals(false, sut);

  }

  @Test
  void canGetChildren() {
    //arrange
    Person child = new Person("Puk");
    List<Person> children = Arrays.asList(child);
    person.setChildren(children);
    // act
    var sut = person.getChildren();
    // asset
    assertEquals(children, sut);
  }

//  @Test
//  void canDoHasUniqueNameIsChildrenEmpty() {
//    // arrange
////    Person child = new Person("Puk");
////    person.setChildren(Arrays.asList(child));
//    person.h
//    // act
//    var sut = person.getChildren().isEmpty();
//
//    // asset
//    assertEquals(true, sut);
//
//  }

  @Test
  void canAddChild() {
    // arrange
    Person puk = new Person("Puk");
    // act
    person.addChild(puk);
    var sut = person.getChildren().contains(puk);

    // asset
    assertEquals(true, sut);
  }

  @Test
  void canAddChildExactly() {
    // arrange
//    Person puk = new Person("Puk");
    var children = person.getChildren();
    // act
    var sut = false;
    for( Person child : children ) {
      if(person.getName().equalsIgnoreCase(child.getName())) {
        sut = true;
      }
    }
    assertEquals(false, sut);

  }



}