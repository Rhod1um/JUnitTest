public class Calculator {

    public int sum(int num1, int num2){
        if (num1 > 100 || num2 > 100){
            //exception
            throw new IllegalArgumentException();
        }
        return num1 + num2;
    }
}
