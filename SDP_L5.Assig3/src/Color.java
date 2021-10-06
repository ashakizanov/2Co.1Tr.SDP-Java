public abstract class Color implements Clothes {
    protected Clothes setColor;

    public Color(Clothes setColor){
        this.setColor = setColor;
    }

    public void wear(){
        setColor.wear();
    }
}