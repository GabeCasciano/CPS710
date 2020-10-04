import java.math.BigInteger;

public class NumberToken extends Token{
    public BigInteger value;

    public NumberToken(){
        value = new BigInteger(super.image);
    }

    @Override
    public BigInteger getValue(){
        return value;
    }

    @Override
    public String toString(){
        return value.toString();
    }
}
