using System.Collections.Generic;

public class Kata
{
    public static List<int> FindMultiples(int integer, int limit)
    {
        List<int> list = new ();
        int j = 0;
        for (int i = 0; j <= limit; i++)
        {
            list[i] = j;
            j += integer;
        }
        return list;
    }
}
