import tkinter as tk


def delete_entry():
    lgn_name.delete(0, tk.END)
    lgn_psswd.delete(0, tk.END)


def login():
    if lgn_name.get() == '123' and lgn_psswd.get() == '321':
        print('Success')
        login_root.destroy()
    else:
        print('Fail')
        tk.Label(login_root, text='Incorrect login or password',
                 fg='red').grid(column=2, row=4, columnspan=3)


login_root = tk.Tk()
login_root.title('Login screen')
login_root.geometry(f"400x200")

label_1 = tk.Label(login_root, text='Welcome')
label_1.config(
    font=('Ink Free', 40, 'bold'),
    bg='red',
    fg='yellow',
    # padx=20,
    # pady=40,
    # width=5,
    # height=1,
    anchor='center',
    relief=tk.FLAT,
    bd=3)
label_1.grid(column=2, row=0, columnspan=3, sticky='we')

tk.Label(login_root, text='Login').grid(column=1, row=1, sticky='w')
tk.Label(login_root, text='Password').grid(column=1, row=2, sticky='w')

lgn_name = tk.Entry(login_root)
lgn_name.grid(column=2, row=1, columnspan=3, sticky='we')

lgn_psswd = tk.Entry(login_root, show='*')
lgn_psswd.grid(column=2, row=2, columnspan=3, sticky='we')

tk.Label(login_root, text='               ').grid(column=0, row=5)

tk.Button(login_root, text='Submit', command=login).grid(column=1,
                                                         row=3,
                                                         columnspan=2,
                                                         sticky='e')
tk.Button(login_root, text='Clear', command=delete_entry).grid(column=3,
                                                               row=3,
                                                               columnspan=4,
                                                               sticky='w')

login_root.mainloop()
