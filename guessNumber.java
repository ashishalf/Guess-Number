import java.util.Scanner;
import java.util.Random;
class game{
    int user;
    int com;
    void takeUserInput(){
        Scanner N =new Scanner(System.in);
        int user =N.nextInt();
    }
    game(){
        Random A=new Random();
        com=A.nextInt(10);
    }
    boolean iscorrectnum(){
        if (user==com){
            return true;
        }
        else if (user<com){
            System.out.println("Too less");
        }
        else if (user>com){
            System.out.println("Too high");
        }
        return false;
    }
}
public class guessNumber {
    public static void main(String[] args) {
        game obj=new game();
        boolean b= false;
        while(!b){
        obj.takeUserInput();
        b =obj.iscorrectnum();
        System.out.println(b);}
    }
}
