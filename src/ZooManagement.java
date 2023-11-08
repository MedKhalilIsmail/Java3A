import java.sql.SQLOutput;
import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {

        /* PROSIT 1
        int nbrCages = 20;
        String zooName = "my zoo";
        ZooManagement zm = new ZooManagement();
        System.out.println(zm.zooName + " comporte " + zm.nbrCages + " cage(s)");

        ZooManagement zm1 = new ZooManagement();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre de vos cages:");
        zm1.nbrCages=sc.nextInt();
        System.out.println("Entrer le nom de votre zoo:");
        zm1.zooName=sc.next();
        System.out.println(zm1.zooName + " comporte " + zm1.nbrCages + " cage(s)");
        */
        /* PROSIT 2 */
        Animal lion = new Animal("Lions","King",5,true);
        Animal singe = new Animal("Singes","Banana",3,true);
        Animal singe1 = new Animal("Singes","Banana",3,true);
        Zoo myZoo = new Zoo("Cap Zoo","Nabeul",25);
        Zoo myZoo1 = new Zoo("Wildlife Zoo","Ariana",25);

        //myZoo.diplayZoo();
        System.out.println(lion.toString());
        System.out.println(myZoo.toString());
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(singe));
        System.out.println(myZoo.addAnimal(singe1));
        myZoo.displayAnimals();
        System.out.println(myZoo.searchAnimal(singe));
        System.out.println(myZoo.removeAnimal(singe));
        if (myZoo.isZooFull()) //if ...==true
            System.out.println(myZoo.name + " est complet.");
        else System.out.println(myZoo.name + " n'est pas complet.");
        System.out.println(Zoo.comparerZoo(myZoo,myZoo1).name + " a plus d'animaux");

    }
}
