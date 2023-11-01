# Задача 32: Определить индексы элементов массива (списка), 
# значения которых принадлежат заданному диапазону 
# (т.е. не меньше заданного минимума и не больше заданного максимума)

import os
from random import randint

os.system('cls' if os.name == 'nt' else 'clear')

size = int(input('Введите длину массива: '))
minValue = int(input('Введите минимальное значение диапазона: '))
maxValue = int(input('Введите максимальное значение диапазона: '))

rand_list = []

for i in range(size):
    rand_list.append(randint(-1000, 1000))
    
print(f'Список случайных значений [-1000; 1000], диапазон поиска [{minValue}; {maxValue}]')

for item in rand_list:
    if item >= minValue and item <= maxValue:
        print(f'Значение эл-та {item}, индекс', rand_list.index(item))