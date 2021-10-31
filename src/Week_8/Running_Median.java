import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Running_Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i < n;i++){
            int tmp = sc.nextInt();
            if(maxHeap.isEmpty() || tmp < maxHeap.peek()) {
                maxHeap.add(tmp);
            } else {
                minHeap.add(tmp);
            }

            if(maxHeap.size() > minHeap.size() + 1) {
                minHeap.add(maxHeap.remove());
            }

            if(minHeap.size() > maxHeap.size() + 1) {
                maxHeap.add(minHeap.remove());
            }

            if(maxHeap.size() > minHeap.size()) {
                System.out.println(String.format("%.1f",(double)maxHeap.peek()));
            }else if(maxHeap.size() < minHeap.size()) {
                System.out.println(String.format("%.1f",(double) minHeap.peek()));
            }else {
                System.out.println(String.format("%.1f",(double) (minHeap.peek()+maxHeap.peek())/2));
            }
        }

    }
}
