package virtual_pet;


public class VirtualPet {

    private int hunger = 20;
    private int thirst = 20;
    private int boredom = 10;
    private int waste = 5;

    public int feed(){
        return this.hunger -= 5;
    }

    public int thirst(){
        return this.thirst -= 5;
    }

    public int boredom(){
        return this.boredom -=2;
    }

    public int waste(){
        return this.waste--;
    }

    public int getHunger(){
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

}
