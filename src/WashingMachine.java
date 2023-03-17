public class WashingMachine extends Machine{
    private int waterPerUse;
    public WashingMachine(int y, boolean o, int w)
    {
        super(y,o);
        waterPerUse = w;
    }
    private int getWaterPerUse()
    {
        return waterPerUse;
    }
}
