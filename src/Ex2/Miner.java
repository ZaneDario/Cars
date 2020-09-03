package Ex2;

public class Miner extends Employee{

    public Miner(int vacations)
    {
        super(vacations);
    }

    void Talk()
    {
        Logger.log("I work extracting rocks!");
    }

    @Override
    public void Work() {
        Logger.log("I'm extracting rocks.");
    }

    @Override
    public String getVacations(){
        return "I have no vacations :(";
    }
}
