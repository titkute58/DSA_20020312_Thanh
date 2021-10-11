import java.util.*;

public class QueueWith2Stacks {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack <Integer> front = new Stack<>();
        Stack <Integer> back = new Stack<>();
        for(int i = 0;i < n;i++) {
            int type, x;
            type = sc.nextInt();
            if(type == 1){
                x = sc.nextInt();
                back.push(x);
            }
            else {
                if(front.empty()){
                    while(!back.empty()) {
                        front.push(back.pop());
                        back.pop();
                    }
                }else{
                    if(type == 2) {
                        front.pop();
                    }
                    if(type == 3) {
                        System.out.println(front.pop());
                    }
                }
            }
        }
    }

}