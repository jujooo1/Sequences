public class While
{
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println("i is " + i + " but less than 15");
            i++;
        }
        int k = 10;
        while (k > 5) {
            System.out.println("k is " + k + " but is greater than 5");
            k--;
        }
        int a = 0;
        int b = 11;
        while (a < 10 & b <= 20) {
            System.out.println("a is " + a + " but is less than 10");
            a++;
            System.out.println("b is " + b + " but is less than or equal to 20");
            b++;
        }
    }
    public static void main(String[] args)
    {        
        While hw = new While();
        hw.run();
    }
}
