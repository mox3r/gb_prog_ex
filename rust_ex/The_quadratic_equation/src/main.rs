use std::io;

fn main() {
    loop {
        println!("РЕШЕНИЕ КВАДРАТНЫХ УРАВНЕНИЙ");

        let mut a_str = String::new();
        let mut b_str = String::new();
        let mut c_str = String::new();

        println!("Введите a: ");
        match io::stdin().read_line(&mut a_str) {
            Ok(_) => {}
            Err(e) => println!("Ошибка ввода {}", e),
        };
        println!("Введите b: ");
        match io::stdin().read_line(&mut b_str) {
            Ok(_) => {}
            Err(e) => println!("Ошибка ввода {}", e),
        };
        println!("Введите c: ");
        match io::stdin().read_line(&mut c_str) {
            Ok(_) => {}
            Err(e) => println!("Ошибка ввода {}", e),
        };

        // print!("a = {}, b = {}, c = {}", a_str, b_str, c_str);

        let a: f64 = a_str.trim().parse().unwrap();
        let b: f64 = b_str.trim().parse().unwrap();
        let c: f64 = c_str.trim().parse().unwrap();

        let d: f64 = b * b - 4.0 * a * c;

        if d > 0.0 {
            let x1 = (-b + d.sqrt()) / (2.0 * a);
            let x2 = (-b - d.sqrt()) / (2.0 * a);

            println!(
                "Решено, корни уравнения:\nD = {}\nx1 = {}\nx2 = {}",
                d, x1, x2
            );
        }
        if d == 0.0 {
            let x1 = -b / (2.0 * a);

            println!("Решено, корень уравнения:\nD = {}\nx = {}", d, x1);
        }
        if d < 0.0 {
            println!("Уравнение не имеет решения, D = {}", d);
        }
    }
}
