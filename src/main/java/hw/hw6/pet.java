package hw.hw6;

import java.util.Arrays;

public class pet {
    private Species species;
    private String  nickname;
    private int age;
    private int tricklevel;
    private String[] habit = new String[]{"eat", "drink", "sleep"};



    public pet(Species species, String nickname, int age, int tricklevel)
    {
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.tricklevel=tricklevel;
        }

    public void eat() {System.out.println("I am eating");}
    public void respond(){System.out.printf("Hello, owner. I am - %s. I miss you!",this.nickname);}
    public void foul(){System.out.println("I need to cover it up");}

    public String getName(){return this.nickname;}
    public int getAge(){return this.age;}
    public Species getSpecies(){return this.species;}
    public int getTricklevel(){return this.tricklevel;}

    public String toString(){
        return String.format("%s %s %s",species, nickname, Arrays.toString(habit));
    }

    @Override
    // finalize method is called on object once
    // before garbage collecting it
    protected void finalize() throws Throwable
    {
        System.out.println("Garbage collector called to destroy unreachable pet class");
        System.out.println("Object garbage collected : " + this);
    }
}