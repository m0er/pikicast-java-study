package codility.skt.techx;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AidenChoi on 2016. 12. 4..
 */
public class MyLinkedList {
    private List<Integer> list;

    public MyLinkedList(int[] args) {
        list = new ArrayList<>();
        init(args);
    }

    private void init(int[] args) {
        explore(args, 0);
    }

    private void explore(int[] args, int index) {
        int value = args[index];
        list.add(value);

        if (value == -1) {
            return;
        }

        explore(args, value);
    }

    public int size() {
        return list.size();
    }
}
