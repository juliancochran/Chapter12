public abstract class Animal {
    private int numLegs;
    private boolean isFemale;
    private String color;
    private boolean isMammal;

    public Animal() {
        numLegs = 0;
        isFemale = true;
        color = "";
        isMammal = true;
    }

    public Animal(int numLegs, boolean isFemale, String color, boolean isMammal) {
        this.numLegs = numLegs;
        this.isFemale = isFemale;
        this.color = color;
        this.isMammal = isMammal;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public abstract String speak();

    public String toString()    {
        return "The " + color + " " + getClass().getName().toLowerCase() + " says " + speak();
    }

    public abstract String getBreed();

    public boolean equals(Object o) {
        if(this.getClass() == o.getClass()) {

            return this.numLegs == ((Animal) o).numLegs &&
                    this.isFemale == ((Animal) o).isFemale &&
                    this.isMammal == ((Animal) o).isMammal &&
                    this.color.equals(((Animal) o).getColor()) &&
                    this.getBreed().equals(((Animal) o).getBreed());

        }
        return false;
    }
}
