public class Dog extends Animal{
    private boolean hasBeenWalked;
    private boolean hasPlayedCatch;
    public Dog(String n, int a, boolean v, boolean s, boolean walked, boolean playedCatch)
    {
        super(n,a,v,s);
        hasBeenWalked = walked;
        hasPlayedCatch = playedCatch;
    }
    public void walk()
    {
        hasBeenWalked = true;
        System.out.println("I have been walked");
    }
    public void playCatch()
    {
        hasPlayedCatch = true;
        System.out.println("I have played catch");
    }

    public boolean isHasBeenWalked() {
        return hasBeenWalked;
    }

    public boolean isHasPlayedCatch() {
        return hasPlayedCatch;
    }
}
