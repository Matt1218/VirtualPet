package models;

public class VirtualPet {

    private String name;
    private int hunger;
    private int boredom;
    private int thirst;

    public VirtualPet(String name) {
        this.name = name;
        this.hunger = 1;
        this.boredom = 0;
        this.thirst = 2;
    }

    public void tick() {
        hunger += 2;
        boredom += 3;
        thirst += 1;
    }

    public void feed(){
        hunger -= 2;
        thirst +=2;
        if (hunger <0){
            hunger = 0;
        }
    }
    public void drink(){
        thirst -=1;
        boredom +=1;
        if (thirst <0){
            thirst = 0;
        }
    }
    public void play(){
        boredom -=3;
        thirst +=1;
        if (boredom <0){
            boredom =0;
        }
    }

    public boolean deadPet(){
        return hunger >= 10 || boredom >= 10 || thirst >=10;

    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getThirst() {
        return thirst;
    }


}
