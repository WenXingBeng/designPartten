package wenxingbeng.com.StatePattern;

/**
 * Created by Pumpking on 2018/9/30.
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopSate stopSate = new StopSate();
        stopSate.doAction(context);
        System.out.println(context.getState().toString());
    }
}
