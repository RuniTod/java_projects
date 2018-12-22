import java.util.Scanner;
import java.util.SplittableRandom;


/*
* класс для запуска калькулятора, scanner поддерживает ввод пользователя
* */
public class Runner{
    public static void main(String[] ags){
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit ="no";
            while (!exit.equals("yes")){
                System.out.println("Enter : first arg");
                String first = reader.next();
                System.out.println("Enter : second arg");
                String second = reader.next();
                System.out.println("Select operation");
                System.out.println(" 1. ADD");
                System.out.println(" 2. Multiplication");
                System.out.println(" 3. Subtraction");
                System.out.println(" 4. Division");
                String third = reader.next();
                switch (third){
                    case "1":
                        calc.add(Integer.valueOf(first),Integer.valueOf(second));
                        System.out.println("Result add: " + calc.getResult());
                        calc.cleanResult();
                        break;
                    case "2":
                        calc.Multiplication(Integer.valueOf(first),Integer.valueOf(second));
                        System.out.println("Result Multiplication: " + calc.getResult());
                        calc.cleanResult();
                        break;
                    case "3":
                        calc.Subtraction(Integer.valueOf(first),Integer.valueOf(second));
                        System.out.println("Result Subtraction: " + calc.getResult());
                        calc.cleanResult();
                        break;
                    case "4":
                        calc.Division(Integer.valueOf(first),Integer.valueOf(second));
                        System.out.println("Result Division: " + calc.getResult());
                        calc.cleanResult();
                        break;
                }
                //ChooseOperation(third,Integer.parseInt(first),Integer.parseInt(second));
                System.out.println("Exit : yes/no");
                exit = reader.next();
            }
        } finally {
            reader.close();
        }
    }
}