import processing.core.PApplet;

public class fourBalls extends PApplet
{
    int x=0,y=0,z=0,za=0;
    private static final int height=750;
    private static final int width=1000;
    private static final int radius=25;
    public static void main(String[] args)
    {
        PApplet.main("fourBalls");
    }

    @Override
    public void settings()
    {
        super.settings();

        size(width, height);
    }


    @Override
    public void draw()
    {
        ellipse(x,height/5,radius,radius);
        x++;

        ellipse(y,(2*height)/5,radius,radius);
        y=2*x;

        ellipse(z,(3*height)/5,radius,radius);
        z=3*x;

        ellipse(za,(4*height)/5,radius,radius);
        za=4*x;
    }
}
