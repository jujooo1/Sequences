public class dowhile
{
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        int i = 20;
        do {
            System.out.println("This loop will run as long as i is less than 15");
            i++;
        } while (i < 15);
        int k = 0;
        do {
            System.out.println("This loop will run as long as k is greater than 5");
            k++;
        } while (k > 5);
        do {
            System.out.println("This loop will run as long as a is less than 10");
            a++;
            System.out.println("This loop will run as long as b is less or equal to 20");
            b++;
        } while ( a < 10 && b <= 20);
    }
    public static void main(String[] args)
    {        
        dowhile hw = new dowhile();
        hw.run();
    }
}