package virtual_pet;


public class VirtualPet {

    private int hunger = 20;
    private int thirst = 20;
    private int boredom = 10;
    private int waste = 5;

    public void feed() {
        this.waste++;
        this.hunger -= 2;

    }

    public void water() {
        this.waste++;
        this.thirst -= 2;
    }

    public void play() {
        this.hunger++;
        this.thirst++;
        this.boredom -= 2;
    }

    public void takeOutside() {
        this.waste--;
    }

    public int getHunger() {
        return this.hunger;
    }

    public int getThirst() {
        return this.thirst;
    }

    public int getBoredom() {
        return this.boredom;
    }

    public int getWaste() {
        return this.waste;
    }

    public void tick() {
        this.hunger++;
        this.thirst++;
        this.boredom++;
        this.waste++;
    }


}





