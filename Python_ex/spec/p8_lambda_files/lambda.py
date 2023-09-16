from random import randint

# size = 10
# list1 = []
# for i in range(size):
#     list1.append(randint(1, 50))

# print(list1)
# list2 = []
# for i in list1:
#     if i % 2 == 0:
#         list2.append((i, i ** 2))

# print(list2)

#map:
# def select(f,col):
    # return [f(x) for x in col]
# filter:
# def where(f, col):
#     return [x for x in col if f(x)]


data = [1, 5, 3, 3, 4, 4, 16, 22, 12, 45, 65, 76, 99, 12, 22, 44]
res = list(map(int, data))
print(res)
res = list(filter(lambda x: x % 2 == 0, res))
print(res)
res = list(map(lambda x: (x, x**2), res))
print(res)

res = list(filter(lambda x: x % 10 == 5, data))
print(res)


# list1 = [x for x in range(1,20)]
# print(list1)
# list1 = list(map(lambda x:x+10, list1))
# print(list1)

# data = '15 2354 4576 3 5687 689 709 23 356 679 970 456 2345 3546'
# data = list(map(int, data.split()))
# print(data)