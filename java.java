class Calculator{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}

public class java{
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 4));
        System.out.println(calc.add(5.5, 6.5));
        System.out.println(calc.add(2, 3, 4));
    }
}