import java.util.ArrayList;

public class Barnyard {
    public static void main(String[] args) {
        ArrayList<Animal> myAnimals = new ArrayList<>();
        myAnimals.add(new Cow(4, true, "brown", true, "Highland"));
        myAnimals.add(new Sheep(4, false, "gray", true, "Merino"));
        myAnimals.add(new Pig(4, true, "pink", true, "Kunekune"));
        myAnimals.add(new Chicken(2, false, "brown", false, "Bantam"));

        Animal c = new Chicken(2, false, "brown", false, "Bantam");

        System.out.println(myAnimals.contains(c));

        // get the ArrayList to return true/false if it is asked
        // if it contains a specific Animal

        //myAnimals.add(new Animal(3,false,"chartreuse",false));
        /*Animal a = new Cow(4,false,"black",true,"Holstein");
        Object o = new String("Yes, Tyler, it would");
        Object thing = new Animal();
        System.out.println(o);
        System.out.println(((String)o).length());*/

        for(Animal a : myAnimals)
            System.out.println(a);
    }
}
