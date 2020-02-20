public class Test {
    public static void main(String[] args) {
        Point point=new Point();
        System.out.println(point);
        point =new Point(3,4);
        System.out.println(point);



        MovablePoint movablePoint=new MovablePoint();
        System.out.println(movablePoint);
        movablePoint=new MovablePoint(2,5,6,7);
        System.out.println(movablePoint);

        movablePoint.setSpeed(3,4);
        movablePoint.move();
        System.out.println(movablePoint.toString());

    }


}
