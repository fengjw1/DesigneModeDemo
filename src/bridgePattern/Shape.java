package bridgePattern;

/**
 * Created by fengjw on 2018/4/17
 * Code Change The World!
 */

public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();

}
