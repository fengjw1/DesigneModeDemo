package bridgePattern;

/**
 * Created by fengjw on 2018/4/17
 * Code Change The World!
 */

public class Circle extends Shape {

    private int x,y,radius;

    protected Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
