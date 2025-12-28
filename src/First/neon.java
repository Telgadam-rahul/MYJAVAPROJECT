package First;

public class neon {
    public static void main(String[] args) {
        for (int num = 0; num <= 100; num++){
        int square= num*num;
        int sum = 0;
         while(square!=0){
        int remainder = square%10;
        sum= sum+remainder;
        square/=10;
         }
        if(sum==num){
            System.out.println(num+" is neon number");

        }
    }
    }
    
    }
