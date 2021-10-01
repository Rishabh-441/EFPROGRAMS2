package practice_questions1;

import java.util.Scanner;
class CheckPal{
    String s;
    CheckPal(String s){
        this.s = s;
    }

    public void display(){
        int start = 0;
        int end = s.length()-1;
        while (start<end){
            if (s.charAt(start) != s.charAt(end)) {
                System.out.println("not palindrome!!");
                break;
            }
            start++;
            end--;
        }
        if (start>=end) System.out.println("palindrome**");
    }
}

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        CheckPal ch = new CheckPal(str);
        ch.display();
    }
}
