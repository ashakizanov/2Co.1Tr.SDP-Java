package AbsctractFactoryPattern;

public class StandartEdition implements PrintingPress{
    @Override
    public Magazine printMagazine(){
        return new SportMagazine();
    }
    public Newspaper printNewsPaper(){
        return new DailyNews();
    }
}
