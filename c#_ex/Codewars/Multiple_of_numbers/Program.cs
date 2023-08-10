using System.Collections.Generic;

public class Kata
{
    public static List<int> FindMultiples(int integer, int limit)
    {
        List<int> list = new List<int>();
        int j = integer;
        while(j <= limit)
        {
          list.Add(j);
          j+= integer;
        }
        return list;
    }
}