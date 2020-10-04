public class IdentifierToken extends Token{
    public String value;

    public IdentifierToken(){
        this.value = super.image;
    }

    @Override
    public String getValue() {
        return value;
    }
}
