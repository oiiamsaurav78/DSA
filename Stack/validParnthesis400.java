package Stack;
import java.util.*;

public class validParnthesis400 {
    public static Boolean isValid(String s){
        char[] chars= s.toCharArray();
        Stack<Character> stack1= new Stack<>();
        int flag=-1;
        for(char ele:chars){
            if(ele=='{' || ele=='[' || ele=='('){
                stack1.push(ele);
                continue;
            }
            else if(stack1.isEmpty()){
                return false;
            }
            char top=stack1.pop();
            if(top=='('&& ele!=')'){
                return false;
            }
            if(top=='{'&& ele!='}'){
                return false;
            }if(top=='['&& ele!=']'){
                return false;
            }
        }
        if(stack1.isEmpty()==true){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the string :");
        // String str= new String();
        String s= input.nextLine();
        System.out.println("The String is Valid parnthesis?: "+ isValid(s));

    }
    

}
