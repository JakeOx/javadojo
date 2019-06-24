package my.lang.basics;

@FunctionalInterface
interface SumFunctionalInterface {
    int sum(int num1, int num2);
    default int multiply(int num1, int num2) {
        return num1*num2;
    }

    static float divide(int num1, int num2) {
        return num1/num2;
    }
    default int subtract(int num1, int num2) {
        return num1-num2;
    }
}


