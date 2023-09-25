public class ExpFactorial extends Exception {
    public ExpFactorial() {
        this("Input value has to be between 1 and 10");
    }

    public ExpFactorial(String msg) {
        super(msg);
    }
}
