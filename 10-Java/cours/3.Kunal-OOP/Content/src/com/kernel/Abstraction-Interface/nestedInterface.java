public class nestedInterface {
    public interface nestedIn{
        boolean isOdd(int n);
    }
}

class B implements  nestedInterface.nestedIn {
    @Override
    public boolean isOdd(int num) {
        return (num % 2 != 0);
    }
}