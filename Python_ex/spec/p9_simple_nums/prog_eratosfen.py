import datetime

n = int(input("n = "))
a = list(range(n + 1))

print(f'List created')
counter = 0

isPrint = False

start_timer = datetime.datetime.now()
lst = []
a[1] = 0

i = 2

while i <= n:
    if a[i] != 0:
        lst.append(a[i])
        counter += 1
    for j in range(i, n + 1, i):
        a[j] = 0
    i += 1

if isPrint: print(lst)

print(f"Количество простых чисел: {counter}")
print(f'Execution time {str(datetime.datetime.now() - start_timer)}')
