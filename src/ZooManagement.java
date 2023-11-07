import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";
    public static void main(String[] args) {
        ZooManagement zm = new ZooManagement();
        System.out.println(zm.zooName + " comporte " + zm.nbrCages + " cage(s)");

        ZooManagement zm1 = new ZooManagement();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre de vos cages:");
        zm1.nbrCages=sc.nextInt();
        System.out.println("Entrer le nom de votre zoo:");
        zm1.zooName=sc.next();
        System.out.println(zm1.zooName + " comporte " + zm1.nbrCages + " cage(s)");
    }
}
