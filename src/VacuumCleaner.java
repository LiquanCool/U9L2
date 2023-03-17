public class VacuumCleaner extends Machine {
    private int strength;
    public VacuumCleaner(int y, boolean o, int s)
    {
        super(y,o);
        strength = s;
    }
    public int getStrength()
    {
        return strength;
    }
}
