package AbsctractFactoryPattern;

public class DailyNews implements Newspaper{
    @Override
    public void sell() {
        System.out.println("DailyNEWS");
    }
}