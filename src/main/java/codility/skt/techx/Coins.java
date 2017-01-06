package codility.skt.techx;

/**
 * Created by AidenChoi on 2016. 12. 4..
 */
public class Coins {

    public int solution(int[] args) {
        int argsSize = args.length;
        int result = 0;
        for (int i = 0; i < argsSize - 1; i++) {
            if (args[i] == args[i + 1])
                result = result + 1;
        }
        int r = 0;
        for (int i = 0; i < argsSize; i++) {
            int count = 0;
            if (i > 0) {
                if (args[i - 1] != args[i])
                    count = count + 1;
                else
                    count = count - 1;
            }
            if (i < argsSize - 1) {
                if (args[i + 1] != args[i])
                    count = count + 1;
                else
                    count = count - 1;
            }
            r = Math.max(r, count);
        }
        return result + r;
    }
}
