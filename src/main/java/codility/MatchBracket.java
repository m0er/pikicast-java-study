package codility;

/**
 * Created by AidenChoi on 2016. 12. 4..
 */
public class MatchBracket {

    public int check(String target) {
        int replaceCount = 0;
        while (target.contains("()")) {
            target = target.replace("()", "");
            replaceCount++;
        }
        return replaceCount * 2;
    }

}
