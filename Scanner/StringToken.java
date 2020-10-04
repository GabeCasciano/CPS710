public class StringToken extends Token{
    public String value;

    @Override
    public String getValue(){
        this.value = super.image.replaceAll("\"", "");
        return value;
    }
}
