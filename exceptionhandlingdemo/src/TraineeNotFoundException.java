public class TraineeNotFoundException extends Exception{
    String msg;

    public TraineeNotFoundException(String msg) {
        super(msg);
        this.msg = msg;
    }
}
