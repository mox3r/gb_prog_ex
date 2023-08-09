from flask import Flask

app = Flask(__name__)

@app.route('/')
def index():
    return'Hello World'

@app.route('/hello/')
def hello():
    return 'Шалом, православные!'

@app.route('/<name>/')
def func_hello(name):
    return f'Шалом, {name}!'
if __name__ == '__name__':
    app.run()