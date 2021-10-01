package practice_questions1;

public class RecurssionConcept {
    public static void main(String[] args) {
        print(23);
    }
    static void print(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
        //In a recursion every function call is allocated a memory in the stack
    }
}
