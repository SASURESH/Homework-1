public class Calculator {

    int a = 10;
    int b = 11;
    int ans;

    public static void main (String [] args){
        Calculator calculator = new Calculator();
        calculator.addition();
        calculator.subtraction();
        calculator.multiplication();
        calculator.division();

    }

    public void addition(){
        ans = a + b;
        System.out.println(ans);
    }

    public void subtraction(){
        ans = a - b;
        System.out.println(ans);

    }

    public void multiplication(){
        ans = a * b;
        System.out.println(ans);
    }

    public void division(){
        ans = a / b;
        System.out.println(ans);
    }

}
