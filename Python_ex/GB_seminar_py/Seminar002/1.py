list_1 = [
    1, 2, 3, 4, 3, 6, 7, 8, 23, 67, 5, 34, 7, 8, 4, 56, 8, 3, 2, 67, 5, 7, 5
]
k = 3
counter = 0
for x in range(len(list_1)):
    if list_1[x] == k:
        counter += 1

print(counter)
