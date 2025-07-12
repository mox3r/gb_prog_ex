use std::io;
use std::time::Instant;

fn fibonacci(n: u64) -> u64 {
    match n {
        0 => 1,
        1 => 1,
        _ => fibonacci(n - 2) + fibonacci(n - 1),
    }
}

fn fib_mul(x: u64) -> f64 {
    let mut i = 1;
    let mut res: f64 = 0.0;
    let base: u64 = 2;
    while i <= x {
        let pow_i = base.pow(i as u32);

        res += fibonacci(i) as f64 / pow_i as f64;

        print!(
            "i = {}\t||\tfib = {}\t||\tpow_i = {}\t||\tres = {}\n",
            i,
            fibonacci(i as u64),
            pow_i,
            res
        );

        i += 1;
    }
    return res;
}

fn main() {
    println!("Числа Фибоначчи делённые на 2 в степени числа\nНапишите \"Q\"/\"q\" для выхода");
    loop {
        let mut n = String::new();

        println!("Задайте положительное значение");

        io::stdin().read_line(&mut n).expect("Нельзя прочитать");

        if n.trim() == "q" || n.trim() == "Q" {
            break;
        };

        let now = Instant::now();

        let n: u64 = match n.trim().parse() {
            Ok(num) => num,
            Err(_) => continue,
        };
        println!("Res = {}", fib_mul(n));

        let elapsed = now.elapsed();
        println!("{:.2?}", elapsed);
    }
}
