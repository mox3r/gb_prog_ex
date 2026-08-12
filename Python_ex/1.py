def remove_the_exclamation_mark(s: str) -> str:
    '''
    :param s: tested word    
    :return: wo last "!" in the end of str
    '''

    # return ''.join(s[i] for i in range(len(s) - 1)) if s[-1] == '!' else s
    # return s.removesuffix('!')
    return s[:-1] if s.endswith('!') else s


print(remove_the_exclamation_mark('Preved Medved!!'))


def test_remove_the_exclamation_mark():
    assert remove_the_exclamation_mark(
        "Hello!") == "Hello", "Should be 'Hello'"
    print("\033[32m'Remove the exclamation mark' Test PASSED\033[0m")


test_remove_the_exclamation_mark()

arr = [0, 2765, 356, 44567, 54, 5, 7, 56, 8, 5985]
arr[0]
print([arr[i] for i in range(1, len(arr)) if arr[i] % i == 0])

a = 0
print(str(a), type(a))

f1 = 2
f2 = 2
print(not f2 == f1)


def how_much_i_love_you(nb_petals: int) -> str:
    """_summary_
    
    Args:
       nb_petals (_int_): _Count of leafs_

    Returns:
        _str_: _How much she loves_
    """

    nb_petals = nb_petals % 6

    match (nb_petals):
        case 1:
            return "I love you"
        case 2:
            return "a little"
        case 3:
            return "a lot"
        case 4:
            return "passionately"
        case 5:
            return "madly"
        case 6:
            return "not at all"


print(how_much_i_love_you(4564567))


def factor(f: int, b: int) -> int:
    return f % b


print(factor(24612, 3))


def initials(name: str) -> str:
    """_summary_

    Args:
        name (_str_): _Your name_

    Returns:
        _str_: _Your initials_
    """
    return f"{'.'.join([s[0] for s in name.strip().split(' ')]).upper()}."


print(initials('Andrew i Mikhnavets'))


def fake_bin(x):

    # li = []

    # for i in range(len(x)):
    #     if x[i] >= '2' and x[i] < '5':
    #         li.append('0')
    #     elif x[i] >= '5':
    #         li.append('1')
    #     else:
    #         li.append(x[i])
    print(''.join('0' if i < '5' else '1' for i in x))
    # TODO: ЗАПОМНИ МЛЕАДЬ!!!!!!!


fake_bin('24365455678')
