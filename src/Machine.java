public class Machine {
    private int yearMade;
    private boolean on;
    public Machine(int y, boolean o)
    {
        yearMade = y;
        on = o;
    }
    public void flipPowerSwitch()
    {
        if (on)
        {
            on = false;
            System.out.println("I have been turned off");
        }
        else
        {
            on = true;
            System.out.println("I have been turned on");
        }
    }
}
