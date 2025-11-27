use std::io;

fn main() {
    loop {
        println!("МЕНЮ:\n1. Решение квадратных уравнений;\nq. Выход");

        let mut choice_str = String::new();

        match io::stdin().read_line(&mut choice_str) {
            Ok(_) => {}
            Err(e) => println!("Ошибка ввода {}", e),
        }

        let choice_str_match = choice_str.trim();

        match choice_str_match {
            "1" => quadratic_equation(),
            "q" => break,
            "Q" => break,
            _ => continue,
        }
        fn quadratic_equation() {
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

            fn print_result(a: f64, b: f64, c: f64) {
                let mut a_sign: String = ' '.to_string();
                let mut b_sign: String = '+'.to_string();
                let mut c_sign: String = '+'.to_string();

                let mut a_value: String = a.abs().to_string();
                let mut b_value: String = b.abs().to_string();

                //a print case
                if a.abs() == 1.0 {
                    a_value = a_sign
                }
                if a < 0.0 {
                    a_sign = '-'.to_string()
                } else {
                    a_sign = ' '.to_string()
                };

                //b print case
                if b == -1.0 {
                    b_value = ' '.to_string();
                    b_sign = '-'.to_string()
                } else if b == 1.0 {
                    b_value = ' '.to_string()
                };
                if b < 0.0 {
                    b_sign = '-'.to_string()
                };

                //c print case
                if c < 0.0 {
                    c_sign = '-'.to_string()
                };
                println!(
                    "Принимает вид:\n {a_sign}{}x**2 {b_sign} {}x {c_sign} {} = 0",
                    a_value,
                    b_value,
                    c.abs()
                );
            }

            print_result(a, b, c);

            if d > 0.0 {
                let x1 = (-b + d.sqrt()) / (2.0 * a);
                let x2 = (-b - d.sqrt()) / (2.0 * a);

                println!(
                    "Решено, корни уравнения:\nD = {}\nx1 = {:.4}\nx2 = {:.4}",
                    d, x1, x2
                );
            }
            if d == 0.0 {
                let x1 = -b / (2.0 * a);

                println!("Решено, корень уравнения:\nD = {}\nx = {:.4}", d, x1);
            }
            if d < 0.0 {
                println!("Уравнение не имеет решения, D = {}", d);
            }
        }
    }
}
