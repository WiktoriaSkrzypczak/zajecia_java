import java.util.*;

public class Kubełkowa implements Sortable {

    private int step = 0;

    @Override
    public int[] sort(int[] arr)
    {
        int n = arr.length;

        ArrayList<Integer>[] bucket = new ArrayList[n];

        for (int i = 0; i < n; i++)
        {
            bucket[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++)
        {
            step++;
            int bucketIndex = (arr[i] * n) % n;
            bucket[bucketIndex].add(arr[i]);
        }

        for (int i = 0; i < n; i++)
        {
            step++;
            Collections.sort((bucket[i]));
        }

        int index = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0, size = bucket[i].size(); j < size; j++)
            {
                arr[index++] = bucket[i].get(j);
            }
        }
        return arr;
    }

    @Override
    public double step_counting()
    {
        return step;
    }
}
