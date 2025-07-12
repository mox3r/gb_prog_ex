from datetime import datetime as dt


def fib(n):
    if n in (1, 2):
        return 1
    return fib(n - 1) + fib(n - 2)


# n = int(input(f'Введите номер элемента: '))
n = 45
i = 2
sum = 0
d = dt.now()
while i <= n:
    f = fib(i)
    t = 2**i
    sum += f / t
    print(f'i = {i} || fib = {f} || 2**i = {t} || sum = {sum}')
    i += 1

print(f'Сумма {sum}\nElapsed Time {dt.now() - d}')
