import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Numbers {
    private String data;
    private int length = 0;

    public void find() {

        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);


        while (matcher.find()) {
            if (matcher.group().length() > length) {
                length = matcher.group().length();
            }
        }

    }

    public int getLength() {
        return length;
    }

    public void setData(String data) {
        this.data = data;
    }


    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.setData("545489756845asdfasdf1retwertw54twertasdf23as548ase5489aas54686aasdf4865123456asdf5");
        numbers.find();
        System.out.println(numbers.getLength());
    }

}
