my_dict = {'A': 'Alfa', 'B': 'Bravo', 'C': 'Charlie',
           'D': 'Delta', 'E': 'Echo', 'F': 'Foxtrot',
           'G': 'Golf', 'H': 'Hotel', 'I': 'India',
           'J':	'Juliett', 'K':	'Kilo', 'L': 'Lima',
           'M':	'Mike', 'N': 'November', 'O': 'Oscar',
           'P':	'Papa', 'Q': 'Quebec', 'R':	'Romeo',
           'S':	'Sierra', 'T': 'Tango', 'U': 'Uniform',
           'V':	'Victor', 'W': 'Whiskey', 'X':	'Xray',
           'Y':	'Yankee', 'Z':	'Zulu',
           }


def nato(word):
    return ' '.join(my_dict[w] for w in word.upper())


print(nato(input('')))
