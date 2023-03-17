public class Cat extends Animal{
    private boolean hasPlayedWith;
    private boolean hasDrankMilk;
    public Cat(String n, int a, boolean v, boolean s, boolean played, boolean givenMilk)
    {
        super(n,a,v,s);
        hasPlayedWith = played;
        hasDrankMilk = givenMilk;
    }
    public void play()
    {
        hasPlayedWith = true;
        System.out.println("I have been played with");
    }
    public void giveMilk()
    {
        hasDrankMilk = true;
        System.out.println("I have drank milk");
    }

    public boolean isHasPlayedWith() {
        return hasPlayedWith;
    }

    public boolean isHasDrankMilk() {
        return hasDrankMilk;
    }
}
