import java.math.BigInteger;

public class NumberToken extends Token{
    public BigInteger value;

    @Override
    public BigInteger getValue(){
        this.value = new BigInteger(super.image);
        return value;
    }

    @Override
    public String toString(){
        return value.toString();
    }
}
