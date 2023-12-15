def slicer(lst):
    # return [] if len(lst) > 1 and len(lst) < 4 else lst[
    #     len(lst) // 2 - 1:len(lst) // 2 +
    #     1][::-1] if len(lst) % 2 == 0 else lst[len(lst) // 2 -
    #                                            1:len(lst) // 2 + 2][::-1]
    return lst[(len(lst) + 1) // 2:len(lst) // 2 - 2:-1]


print(54 % 2)
print(slicer([1, 2, 2, 3, 5, 4, 3, 4, 5]))
