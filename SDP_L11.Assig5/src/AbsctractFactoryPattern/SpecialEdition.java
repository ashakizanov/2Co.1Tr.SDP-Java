package AbsctractFactoryPattern;

public class SpecialEdition implements PrintingPress{

    @Override
    public Magazine printMagazine(){
        return new StarMagazine();

    }
    public Newspaper printNewsPaper(){
        return new WorldNews();
    }
}
