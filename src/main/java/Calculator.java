public class Calculator {
    private int firstNum;
    private int secondNum;

    public Calculator(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public int getFirstNum() {
        return this.firstNum;
    }

    public int getSecondNum() {
        return this.secondNum;
    }

    public int add(int n1, int n2){
        return (n1 + n2);
    }

    public int subtract(int n1, int n2) {
        return (n1 - n2);
    }

    public int multiply(int n1, int n2) {
        return (n1*n2);
    }

    public int divide(int n1, int n2){
        return (n1/n2);
    }
}
