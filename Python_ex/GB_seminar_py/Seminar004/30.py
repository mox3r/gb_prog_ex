# Задача 30:  Заполните массив элементами арифметической прогрессии.
# Её первый элемент, разность и количество элементов нужно ввести с клавиатуры.
# Формула для получения n-го члена прогрессии: an = a1 + (n-1) * d.
# Каждое число вводится с новой строки.
import os

os.system('cls' if os.name == 'nt' else 'clear')

a = int(input('Введите первый элемент прогрессии a: '))
d = int(input('Введите разность элементов d: '))
n = int(input('Введите число элементов n: '))

a_list = []
i = 0
while (i < n):
    a_list.append(a + i * d)
    i += 1

print(a_list)