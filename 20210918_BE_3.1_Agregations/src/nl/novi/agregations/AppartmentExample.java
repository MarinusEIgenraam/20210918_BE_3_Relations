package nl.novi.agregations;

import java.util.ArrayList;
import java.util.List;

public class AppartmentExample {
    public static void main(String[] args) {
        Person beatrix = new Person("Beatrix", "van Nassau");
        Person willie = new Person("Willie", "van Nassau");
        Person max = new Person("Maxima", "van Nassau");
        Person amalia = new Person("Amalia", "van Nassau");

        // We maken hier een appartment-object aan zonder een gevulde lijst mee te geven.
        Appartment soestdijk = new Appartment("Amsterdamsestraatweg", "1");

        //Vervolgens voegen we personen toe via het Appartment-object.
        soestdijk.addPerson(beatrix);
        soestdijk.addPerson(willie);
        soestdijk.addPerson(max);
        soestdijk.addPerson(amalia);

        System.out.println(soestdijk.toString());

        //We maken eerst een list met Random personen.
        Person studentOne = new Person("Sjaak", "Patat");
        Person studentTwo = new Person("Fred", "Frikandel");
        Person studentThree = new Person("Co", "Kroket");
        Person studentFour = new Person("Piet", "Friet");
        List<Person> personList = new ArrayList<>();
        personList.add(studentOne);
        personList.add(studentTwo);
        personList.add(studentThree);
        personList.add(studentFour);

        Appartment krot = new Appartment("Groot Hertoginnelaan", "30", personList);

        System.out.println(krot.toString());
    }
}