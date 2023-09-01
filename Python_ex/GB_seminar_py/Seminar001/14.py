# Задача 14: Требуется вывести все целые степени двойки
# (т.е. числа вида 2**k), не превосходящие числа N.


def mulTwo(n=int(input('Введите цель: '))):
    powers = []
    i = 1
    while (i <= n):
        powers.append(i)
        i = i * 2
    return powers


print(mulTwo())