public class Chicken extends Animal {
    private String breed;

    public Chicken(String breed) {
        this.breed = breed;
    }

    public Chicken(int numLegs, boolean isFemale, String color, boolean isMammal, String breed) {
        super(numLegs, isFemale, color, isMammal);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String speak()   {
        return "cluck cluck";
    }
}
