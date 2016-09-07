package HeadFirst.Adapter;

/**
 * @author NikoBelic
 * @create 9/7/16 19:15
 */
public class TurkeyAdapter implements Duck
{
    Turkey turkey;
    public TurkeyAdapter(Turkey turkey)
    {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0 ; i < 5 ; i++)
        {
            turkey.fly();
        }
    }
}
