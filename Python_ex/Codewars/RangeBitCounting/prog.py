def range_bit_count(a, b):
    # list_1 = []
    # while (a <= b):
    #     list_1.append(a)
    #     a += 1

    # # print(list_1)

    # list_2 = []
    # i = 0
    # while i < len(list_1):
    #     list_2.append(format(list_1[i], 'b'))
    #     i += 1

    # # print(list_2)

    # res = [j.count('1') for j in list_2]
    # # print(res)
    # return sum(res)
    return sum(bin(i).count('1') for i in range(a, b + 1))


print(range_bit_count(1, 10000))
