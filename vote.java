import java.util.Scanner;
class vote{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int x;
        x=obj.nextInt();
        if(x>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }

       

    }
}