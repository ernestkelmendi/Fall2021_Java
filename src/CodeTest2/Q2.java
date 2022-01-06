package CodeTest2;


public class Q2 {
    public static void main(String[] args) {
        int n=5,fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial value is = (5*4*3*2*1) = " +fact);

        n = 1;
        int fact2 = 1;
        for (int i=1;i<=n;i++) {
            fact2=fact2*i;
        }
        System.out.println("The factorial value is = (1) = " +fact2);

        n = 3;
        int fact3 = 1;
        for (int i=1;i<=n;i++) {
            fact3=fact3*i;
        }
        System.out.println("The factorial value is = (3*2*1) = " +fact3);

        n = 10;
        int fact4 = 1;
        for (int i=1;i<=n;i++) {
            fact4=fact4*i;
        }
        System.out.println("The factorial value is = (10*9*8*7*6*5*4*3*2*1) = " +fact4);
    }
}