
public class Error {

    static int i;

    static {
        i = 10;
    }

    public static void main(String[] args) {
        System.err.println(Error.i);
    }

}
