package bridgePattern;

/**
 * Created by fengjw on 2018/4/17
 * Code Change The World!
 */

public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("draw red circle");
    }
}
