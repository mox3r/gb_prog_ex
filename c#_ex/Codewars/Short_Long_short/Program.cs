public class ShortLongShort
{
  public static string Solution(string a, string b)
  {
   return (a.Length <= b.Length) ? a + b + a : b + a + b;
  }
}