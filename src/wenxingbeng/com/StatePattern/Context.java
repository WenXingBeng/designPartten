package wenxingbeng.com.StatePattern;

/**
 * Created by Pumpking on 2018/9/30.
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
