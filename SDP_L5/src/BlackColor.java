public class BlackColor extends Color {

    public BlackColor(Clothes setColor) {
        super(setColor);
    }

    @Override
    public void wear() {
        setColor.wear();
        setBlackColor(setColor);
    }

    private void setBlackColor(Clothes setColor){
        System.out.println("Its color will be black");
    }
}