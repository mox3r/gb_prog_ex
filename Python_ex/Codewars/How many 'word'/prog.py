import random
import string


def test_it(s):
    counter = 0
    word = list('word')
    for letter in s.lower():
        if letter == word[0]:
            word.pop(0)
            if len(word) == 0:
                counter += 1
                word = list('word')

    return counter


res = ''.join(random.choices(string.ascii_lowercase, k=500))
print(res)
print(test_it(res))
