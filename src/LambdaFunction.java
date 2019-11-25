/**
 * "Created by : goodlikemax"
 * "Date: "18.10.2019
 */
public class LambdaFunction {
    public static void main(String[] args) {
        int x = 10;
        int y = 30;
        System.out.printf("first %d and  %d \n", x , y);

    Operationable operationable;
    operationable = (a,b) -> a + b;
        System.out.println((operationable.calculate(10,11)));
    }

    interface Operationable {
        int calculate(int a, int b);
    }
}
