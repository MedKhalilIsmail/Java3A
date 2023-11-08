public class Zoo {
    Animal[] animals;
    String name,city;
    static final int nbrCages=25;
    int nbrAnimals=0;


    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }

    /*void diplayZoo(){
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages);
    }*/

    @Override
    public String toString(){
        return "Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages;
    }

    boolean addAnimal(Animal animal){
        if ((nbrCages>nbrAnimals)&&(searchAnimal(animal)==-1)) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
        else return false;
    }

    void displayAnimals(){
        System.out.println("La liste des animaux de " + name + ":");
        for(int i=0;i<nbrAnimals;i++){
            System.out.println(animals[i]);
        }
    }

    int searchAnimal(Animal animal){
        int index = -1;
        for(int i=0;i<nbrAnimals;i++){
            if(animals[i].name == animal.name)
                index = i;
        }
        return index;
    }

    boolean removeAnimal(Animal animal){
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1){
            System.out.println(animal.name + "n'est pas dans la liste des animaux");
            return false;
        }
        else {
            for(int i=indexAnimal;i<nbrAnimals;i++){
                animals[i] = animals[i+1];
                animals[i+1] = null;
            }
            this.nbrAnimals--;
            System.out.println(animal.name + " a été supprimé avec succés");
            return true;
        }
    }

    boolean isZooFull(){
        return nbrAnimals == nbrCages;
    }

    static Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.nbrAnimals <= z2.nbrAnimals) {
            return z2;
        } else {
            return z1;
        }
    }
}

