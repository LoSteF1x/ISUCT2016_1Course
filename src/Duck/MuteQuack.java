package Duck;

/**
 * Created by UI on 25.10.2017.
 */
public class MuteQuack implements QuackBehavior {
    public void quack(){
        System.out.println("<<< Silence >>>");
    }
}