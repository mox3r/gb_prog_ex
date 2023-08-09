time = input('input normal time: ')


def to_industrial(time):
    if isinstance(time, str):
        h, m = map(int, time.split(':'))
        time = 60 * h + m
    return round(time/60, 2)


print(to_industrial(time))

t = input('input decimal time: ')


def to_normal(time):
    h = float(time)
    h1 = int (h)
    m = round((h % 1) * 60)
    return f'{h1}:{m:02d}'


print(to_normal(t))
