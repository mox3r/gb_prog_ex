import random
import string
# import os
import time

print("Random monkey tries to enter your word")
res = ""
word = input("Input word: ")
counter = 0

timerStart = time.time()

while res != word:
    res = ''.join(random.choices(string.ascii_lowercase, k=len(word)))
    counter += 1
    # if counter % 100000 == 0:
    #     print(f"Count: {counter}, sequence {res}")
    #     os.system('clear')

timerEnd = time.time()

print(
    f"Total tries: {counter}. LF word: \"{res}\" Execution time {(timerEnd - timerStart)*10**3:.03f} ms"
)
