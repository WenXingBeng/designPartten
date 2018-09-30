package wenxingbeng.com.StatePattern;

/**
 * Created by Pumpking on 2018/9/30.
 */
public class StopSate implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
