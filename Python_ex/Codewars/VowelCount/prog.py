def get_count(sentance):
    # count = 0
    # for char in sentance:
    #     if char in 'aeiou':
    #         count += 1
    # return count
    return sum(c in 'aeoiu' for c in sentance)

print(get_count(input('Enter the word: ')))