# Задача 24: В фермерском хозяйстве в Карелии выращивают чернику.
# Она растёт на круглой грядке, причём кусты высажены только по окружности.
# Таким образом, у каждого куста есть ровно два соседних. Всего на грядке растёт N кустов.
# Эти кусты обладают разной урожайностью, поэтому ко времени сбора на
# них выросло различное число ягод — на i-ом кусте выросло ai ягод.
# В этом фермерском хозяйстве внедрена система автоматического сбора черники.
# Эта система состоит из управляющего модуля и нескольких собирающих модулей.
# Собирающий модуль за один заход, находясь непосредственно перед некоторым кустом,
# собирает ягоды с этого куста и с двух соседних с ним.
# Напишите программу для нахождения максимального числа ягод,
# которое может собрать за один заход собирающий модуль, находясь перед некоторым кустом заданной во входном файле грядки.
import os
from random import randint

os.system('cls' if os.name == 'nt' else 'clear')


def bush_berry_counter(bushBerry_list):
    size = len(bushBerry_list)
    bushBerry_list = bushBerry_list + bushBerry_list[:2]
    top_counter = 0
    for i in range(size):
        top_counter = max(
            top_counter,
            bushBerry_list[i] + bushBerry_list[i + 1] + bushBerry_list[i + 2])
    return top_counter


maxBerry = int(input('Введите количество ягод на кусте: '))
bushCount = int(input('Введите колличество кустов: '))

bush_berries = [randint(0, maxBerry) for i in range(bushCount)]

print(bush_berries)
print('Максимальное число ягод за один заход:',
      bush_berry_counter(bush_berries))
