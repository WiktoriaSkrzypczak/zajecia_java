public class Bąbelkowa implements Sortable
{
    private int step=0;

    @Override
    public int[] sort(int[] tab)
    {
        for (int i = 0; i < tab.length; i++)
        {
            for (int j = 1; j < tab.length; j++)
            {
                step++;
                if(tab[j-1] > tab[j])
                {
                    int t;
                    t = tab[j-1];
                    tab[j-1]=tab[j];
                    tab[j] = t;
                }
            }
        }
        return tab;
    }

    @Override
    public double step_counting()
    {
        return step;
    }
}
