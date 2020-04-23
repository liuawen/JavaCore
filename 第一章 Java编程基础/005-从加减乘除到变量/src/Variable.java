/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-04-23 23:13
 */
public class Variable {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        int x = 6;
        int y = a*x + b*x*x + c*x*x*x*x;
        System.out.println(y);
    }
}
