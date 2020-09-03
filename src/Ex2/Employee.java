package Ex2;

public abstract class Employee {

    float money = 0;
    int vacations;

    public Employee(int vacations)
    {
        this.vacations = vacations;
    }

    public void getPaid(float salary)
    {
        money += salary;
    }

    public String getVacations()
    {
        return "I have " + vacations + " left";
    }

    public void setVacations(int wastedDays)
    {
        vacations -= wastedDays;
    }

    public abstract void Work();
}
