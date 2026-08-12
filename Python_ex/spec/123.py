from datetime import datetime as dt


def fib():
    a, b = 0, 1
    while True:
        yield a
        a, b = b, a + b


# n = int(input(f'Введите номер элемента: '))
n = 100
i = 0
sum = 0
d = dt.now()
f = fib()
while i <= n:
    t = 2**i
    r = next(f)
    sum += r / t
    print(f'i = {i} || fib = {r} || 2**i = {t} || sum = {sum}')
    i += 1

print(f'Сумма {sum}\nElapsed Time {dt.now() - d}')
