package wenxingbeng.com.StatePattern;

/**
 * Created by Pumpking on 2018/9/30.
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
