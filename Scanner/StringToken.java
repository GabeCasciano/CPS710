public class StringToken extends Token{
    public String value;

    public StringToken(){
        this.value = super.image.replaceAll("\"", "");
    }

    @Override
    public String getValue(){
        return value;
    }
}
