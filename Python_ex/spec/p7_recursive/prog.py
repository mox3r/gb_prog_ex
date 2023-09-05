import os

a = 50
b = 5


def sum(a, b):
    return a if b <= 0 else 1 + sum(a, b - 1)


def f(a, b):
    return 1 if b <= 0 else a * f(a, b - 1)


os.system('cls' if os.name == 'nt' else 'clear')

print(f'{a} в степени {b} равна', f(a, b))
print(f'Сумма {a} и {b} равна', sum(a, b))
