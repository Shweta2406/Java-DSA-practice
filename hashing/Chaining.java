// Converted from C++ to Java
import java.util.*;

public class Chaining {


    static class Myhash
    {
        int bucket;
        List<Integer>[] table;

        @SuppressWarnings("unchecked")
        Myhash(int b)
        {
            bucket = b;
            table = (List<Integer>[]) new ArrayList[bucket];
            for (int i = 0; i < bucket; i++) {
                table[i] = new ArrayList<>();
            }
        }

        public void insert(int x)
        {
            int k = x % bucket;
            table[k].add(x);
        }

        public void remove(int k)
        {
            int i = k % bucket;
            table[i].remove(Integer.valueOf(k));
        }

        public boolean search(int x)
        {
            int k = x % bucket;
            for (Integer i : table[k])
            {
                if (x == i)
                {
                    return true;
                }
            }
            return false;
        }

    };

    public static void main(String[] args)
    {
        Myhash h = new Myhash(7);
        h.insert(11);
        h.insert(12);
        h.insert(13);
        h.insert(14);
        h.remove(11);
        System.out.print(h.search(14));

    }
}

