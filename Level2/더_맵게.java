import java.util.PriorityQueue;;

public class 더_맵게 {
    public static void main(String[] args) {
        더_맵게 sol = new 더_맵게();
        int[] scoville = {
            1, 2, 3
        };
        int K = 11;

        System.out.println(sol.solution(scoville, K));
    }

    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Long> queue = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++){
            queue.offer((long)scoville[i]);
        }

        Long min1 = 0L;
        Long min2 = 0L;
        Long newScoville = 0L;
        while(queue.size() != 1 && (min1 = queue.poll()) < K){
            min2 = queue.poll();

            newScoville = min1 + (min2 * 2);
            queue.offer(newScoville);
            answer++;
        }

        if ((min1 = queue.poll()) < K){
            return -1;
        }
        else {
            return answer;
        }
    }
}
