package iticbcn.xifratge;

public class TextXifrat {
    private byte[] bytes;

    @Override
    public String toString(){
        return new String(bytes);
    }

    public TextXifrat(byte[] bytes){
        this.bytes = bytes;
    }

    public byte[] getBytes(){return bytes;}
}
