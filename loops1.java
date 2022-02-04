import java.util.*;
public class loops1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int N = teclado.nextInt();
        int i;
        for(i=1;i<=10;i++)
        {
	System.out.printf("%d x %d = %d\n",N,i,N*i);
        }
        
        teclado.close();
    }
}
