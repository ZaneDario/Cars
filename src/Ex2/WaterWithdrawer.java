package Ex2;

public class WaterWithdrawer extends Employee {

    public WaterWithdrawer(int vacations)
    {
        super(vacations);
    }

    void Talk()
    {
        Logger.log("I work extracting water!");
    }

    @Override
    public void Work() {
        Logger.log("I'm extracting water.");
    }
}
