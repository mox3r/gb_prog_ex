from time import time

isPrint = False

n = int(input("n = "))

counter = 1
startTime = time()

lst = [2]
for i in range(3, n + 1, 2):
    if (i > 10) and (i % 10 == 5):
        continue
    for j in lst:
        if j * j - 1 > i:
            lst.append(i)
            counter += 1
            break
        if (i % j == 0):
            break
    else:
        lst.append(i)
        counter += 1
if isPrint: print(lst)
print(f"Количество простых чисел: {counter}")
print('Execution time %3.2fs' % (time() - startTime))
