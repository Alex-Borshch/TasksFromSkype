import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Words {

    String data = "avfdsa geg aefjk asegaax frewa uhkuhiu asdfas feff tuiodkt";

    public List<String> findWords(String words) {
        String regex = "\\b(\\w)\\w*\\1\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(words);
        List<String> rez = new LinkedList<String>();


        while (matcher.find()) {
            rez.add(matcher.group());
        }
        return rez;
    }

    public static void main(String[] args) {

        Words words = new Words();
        List<String> list = words.findWords(words.data);
        for (String s :
                list) {
            System.out.println(s);
        }

    }
}


