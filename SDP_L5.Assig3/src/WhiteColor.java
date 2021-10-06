public class WhiteColor extends Color {

    public WhiteColor(Clothes setColor) {
        super(setColor);
    }

    @Override
    public void wear() {
        setColor.wear();
        setWhiteColor(setColor);
    }

    private void setWhiteColor(Clothes setColor){
        System.out.println("Its color will be white");
    }
}