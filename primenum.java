
public class primenum {
      public static void main(String[] args) {
        int i ,j ;
        for (i = 2; i <= 20; i++)
        {
            int count = 0;
            for (j=2;j<=i/2;j++)
            {
                if (i % j == 0){
                    count++;
                    break;
                }
            }
            if (count == 0 && i != 1){
                System.out.print(i + " ");
            }
        }
}
}