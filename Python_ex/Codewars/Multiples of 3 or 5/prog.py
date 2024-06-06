def solution(number):
    lst = []
    number -= 1
    while number > 0:
        if number % 3 == 0 or number % 5 == 0:
            if number in lst:
                continue
            else:
                lst.append(number)
        number -= 1
    print(lst)
    return sum(lst)


print(solution(6))
