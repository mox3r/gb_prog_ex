void InputArray(int[] array)
{
    for (int i = 0; i < array.Length; i++)
        array[i] = new Random().Next(-100, 101); // [-10; 10]
}


int[] SortByChoice(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        int min = i;
        for (int j = i + 1; j < array.Length; j++)
        {
            if (array[j] < array[min])
            {
                min = j;
            }
        }
        int temp = array[min];
        array[min] = array[i];
        array[i] = temp;
    }
    return array;
}


Console.Clear();
Console.Write("Введите кол-во элементов массива: ");
int n = int.Parse(Console.ReadLine()!);
int[] array = new int[n];
InputArray(array);
Console.WriteLine($"Исходный массив: [{string.Join(", ", array)}]");
Console.WriteLine($"Конечныый массив: [{string.Join(", ", SortByChoice(array))}]");