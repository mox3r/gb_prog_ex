using System.Collections.Generic;

public class Kata
{
    public static List<int> FindMultiples(int integer, int limit)
    {
        List<int> list = new List<int>();
        int j = integer;
        for (int i = 0; j <= limit; i++)
        {
          list.Add(j);
          j+= integer;
        }
        return list;
    }
}