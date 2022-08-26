import processing.core.PApplet;

public class fourBalls extends PApplet
{
    int velocityBall1=0,velocityBall2=0,velocityBall3=0,velocityBall4=0;
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
        ellipse(velocityBall1,height/5,radius,radius);
        velocityBall1++;

        ellipse(velocityBall2,(2*height)/5,radius,radius);
        velocityBall2=2*velocityBall1;

        ellipse(velocityBall3,(3*height)/5,radius,radius);
        velocityBall3=3*velocityBall1;

        ellipse(velocityBall4,(4*height)/5,radius,radius);
        velocityBall4=4*velocityBall1;
    }
}
