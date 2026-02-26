import java.util.Scanner;
public class PalindromeCheckerApp {
    public static  void main(String[] args){
        System.out.println("input:");
        Scanner scanner=new Scanner(System.in);
        String name =(scanner.next());
        name= name.toLowerCase();
        boolean present =false;
        for(int i =0; i<(name.length())/2;i++){
            for(int j =(name.length())-1;j>=(name.length())/2;j--){
                if(name.charAt(i)==name.charAt(j)){
                    present=true;
                    break;
                }
            }
        }
        System.out.println("is it  palindrome? :"+present);
    }
}
