from random import randint
import time
from array import *

size = 10000
arr1 = [size]
for x in range(size):
    arr1.append(randint(-10000, 10000))
    
arr2 = arr1[:]    
# print(arr1)
ta = time.perf_counter()
for i in range(size - 1):
    for j in range(size - i - 1):
        if arr1[j] > arr1[j+1]:
            arr1[j], arr1[j+1] = arr1[j+1], arr1[j]
tb = time.perf_counter()


print(f"arr1: Время {tb - ta:0.3f} сек")
# print(arr1)


# print(arr1)
ta = time.perf_counter()
for i in range(size - 1):
    for j in range(size - 1):
        if arr2[j] > arr2[j+1]:
            arr2[j], arr2[j+1] = arr2[j+1], arr2[j]
tb = time.perf_counter()


print(f"arr2: Время {tb - ta:0.3f} сек")