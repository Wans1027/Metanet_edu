package JAVA_Basic_03_OOP.kr.or.kosa;

public class Tv {
    public int channel;
    public String brandName;

    public void channelUp(){
        ++channel;
    }
    public void channelDown(){
        --channel;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "channel=" + channel +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
