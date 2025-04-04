import random as rnd

count = 0


def say_pressed():
    print('Pressed!')


def label_pressed():
    rnd_color = lambda: rnd.randint(0, 255)
    bg_color = f'#{rnd_color():02X}{rnd_color():02X}{rnd_color():02X}'  # f'#%02X%02X%02X' % (a(), a(), a())
    win['bg'] = (bg_color)
    print(f'{bg_color}')
    label['text'] = f'BG color: {bg_color}'


def counter():
    global count
    count += 1
    btn_4['text'] = f'Counter {count}'


import tkinter as tk

win = tk.Tk()
win.title('MyFirstApp')
win.geometry("640x480+100+100")

label_1 = tk.Label(win, text='Hello')
label_1.config(
    font=('Ink Free', 50, 'bold'),
    bg='red',
    fg='yellow',
    # padx=20,
    # pady=40,
    width=5,
    height=1,
    anchor='center',
    relief=tk.FLAT,
    bd=3)
label_1.grid(column=3, row=0)

btn_1 = tk.Button(win, text='Press me!', command=say_pressed)
btn_1.grid(column=1, row=0)
btn_2 = tk.Button(win, text='Background color changer!', command=label_pressed)
btn_2.grid(column=0, row=1)
btn_3 = tk.Button(win,
                  text='Lambda',
                  command=lambda: tk.Label(win, text=f'{rnd.randint(0,222)}').
                  grid(column=1, row=2)).grid(column=0, row=2)

btn_4 = tk.Button(win, text=f'Counter {count}', command=counter)
btn_4.grid(column=0, row=3)

label = tk.Label(win, text=f'BG color: default')
label.grid(column=1, row=1)

btn_5 = tk.Button(win, text='Close', command=win.destroy).grid(column=0, row=4)
win.mainloop()
