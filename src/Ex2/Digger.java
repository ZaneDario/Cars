package Ex2;

public class Digger extends Employee{

    public Digger(int vacations)
    {
        super(vacations);
    }

    void Talk()
    {
        Logger.log("I work extracting sand!");
    }

    @Override
    public void Work() {
        Logger.log("I'm extracting sand.");
    }
}
