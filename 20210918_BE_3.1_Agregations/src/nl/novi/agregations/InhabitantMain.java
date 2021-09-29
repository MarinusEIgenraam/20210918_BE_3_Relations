package nl.novi.agregations;

public class InhabitantMain {
    public static void main(String[] args) {
        Inhabitant sjonnie = new Inhabitant("Sjonnie", "Flodder");
        House yellowHouse = new House("Rode straat", "1bis");
        sjonnie.setHouse(yellowHouse);

        System.out.println(sjonnie.toString());

        Inhabitant kees = new Inhabitant("Kees", "Flodder", yellowHouse);
        Inhabitant maFlodder = new Inhabitant("Ma", "Flodder", yellowHouse);

        System.out.println(kees.toString());
        System.out.println(maFlodder.toString());

        System.out.println("En het huis:");
        System.out.println(yellowHouse.toString());

        Inhabitant koos = new Inhabitant("Koos", "Dakloos");
        System.out.println(koos.toString());
    }
}