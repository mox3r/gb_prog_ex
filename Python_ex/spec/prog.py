import random
import string
# import os
import datetime

print("Random monkey tries to enter your word")
res = ""
word = input("Input word: ")
counter = 0

timerStart = datetime.datetime.now()

while res != word:
    res = ''.join(random.choices(string.ascii_lowercase, k=len(word)))
    counter += 1
    # if counter % 100000 == 0:
    #     print(f"Count: {counter}, sequence {res}")
    #     os.system('clear')

timerEnd = datetime.datetime.now()

print(
    f"Total tries: {counter}. LF word: \"{res}\" Execution time {str(timerEnd - timerStart)} ms"
)
