package First;

public class neon {
    public static void main(String[] args) {
        int num=9;
        int square= num*num;
        int sum = 0;
         while(square!=0){
        int remainder = square%10;
        sum= sum+remainder;
        square/=10;
         }
        if(sum==num){
            System.out.println("neon number");

        }
        else{
            System.out.println("not neon");
        }
        
    }
    
    }
