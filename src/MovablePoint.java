import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

     public MovablePoint(){

     }
     public MovablePoint(float x,float y,float xSpeed,float ySpeed){
         super(x,y);
         this.xSpeed=xSpeed;
         this.ySpeed=ySpeed;

     }
    public MovablePoint(float x,float y){
         super(x,y);

    }

    public float getXSpeed()
    {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed)
    {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
         return new float[]{getX(),getY(),xSpeed,ySpeed};
    }
    public void setSpeed(float xSpeed,float ySpeed){
         this.xSpeed=xSpeed;
         this.ySpeed=ySpeed;

    }

    @Override
    public String toString() {
        return Arrays.toString(getSpeed());
    }
    public MovablePoint move(){
         setXY(getX() +xSpeed,getY()+ySpeed);
         return  this;

    }
}
