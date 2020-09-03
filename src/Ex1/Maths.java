package Ex1;

public class Maths extends Logger{
    public int sum(int x, int y)
    {
        return x+y;
    }

    public int sum(int x, int y, int z)
    {
        int result = x + y + z;
        log(Integer.toString(result));
        return result;
    }

    public static int subs(int x, int y)
    {
        int result = x - y;
        return result;
    }
}
