public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private boolean slept;

    public Animal(String n, int a, boolean v, boolean s)
    {
        name = n;
        age = a;
        vaccinated = v;
        slept = s;
    }
    public void adopt()
    {
        System.out.println("I have been adopted");
    }
    public void feed()
    {
        System.out.println("I have been fed");
    }
    public void sleep()
    {
        slept = true;
        System.out.println("I have slept");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public boolean isSlept() {
        return slept;
    }
}
