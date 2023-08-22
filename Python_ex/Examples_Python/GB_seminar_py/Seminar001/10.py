# На столе лежат n монеток. Некоторые из них лежат вверх решкой, а некоторые – гербом.
# Определите минимальное число монеток, которые нужно перевернуть,
# чтобы все монетки были повернуты вверх одной и той же стороной.
#
# Выведите минимальное количество монет, которые нужно перевернуть

import random


def coin():
    n = int(input('Введите число монеток: '))
    counter = 0

    lst = [random.randint(0, 1) for i in range(n)]
    print(lst[:])
    for i in range(len(lst)):
        if (lst[i] == 1):
            counter += 1

    if (counter >= n/2):
        return n-counter
    else:
        return counter


print(coin())
