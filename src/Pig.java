public class Pig extends Animal {
    private String breed;

    public Pig(String breed) {
        this.breed = breed;
    }

    public Pig(int numLegs, boolean isFemale, String color, boolean isMammal, String breed) {
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
        return "oink";
    }
}
