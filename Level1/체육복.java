import java.util.Arrays;

public class 체육복 {
    public static void main(String[] args){
        Solution sol = new Solution();

        int n = 5;
        int[] lost = {1, 4};
        int[] reserve = {3, 4};

        System.out.println(sol.solution(n, lost, reserve));
    }

    public static class Solution{
        public int solution(int n, int[] lost, int[] reserve){
            int answer = 0;
            int borrowCount = 0;
            int extraAndSteal = 0;

            Arrays.sort(lost);
            Arrays.sort(reserve);

            // 여벌 체육복을 가져온 학생이 도난당할 경우
            for(int i=0; i<lost.length; i++){
                for(int j=0; j<reserve.length; j++){
                    if (lost[i] == reserve[j]){
                        lost[i] = -1;
                        extraAndSteal++;
                        break;
                    }
                }
            }

            for(int i=0; i<reserve.length; i++){
                for(int j=0; j<lost.length; j++){
                    if ((reserve[i] - 1 == lost[j] || // 여분 체육복 갖고있는 사람의 앞 번호가 도난당했는지
                    reserve[i] + 1 == lost[j]) && // 여분 체육복 갖고있는 사람의 뒷 번호가 도난당했는지
                    (lost[j] != -1) // 체육복을 못빌렸다면
                    )
                    {
                        lost[j] = -1; // 체육복을 빌렸음
                        borrowCount++;
                        break;
                    }
                }
            }

            answer = n - lost.length + extraAndSteal + borrowCount;
            return answer;
        }
    }
}
