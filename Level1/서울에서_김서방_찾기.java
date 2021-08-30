public class 서울에서_김서방_찾기 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] seoul = {"Jane", "Kim"};
        System.out.println(sol.solution(seoul));
    }

    public static class Solution{
        public String solution(String[] seoul){
            String answer = "";

            for(int i=0; i<seoul.length; i++){
                if (seoul[i].equals("Kim")){
                    answer = String.format("김서방은 %d에 있다", i);
                    break;
                }
            }

            return answer;
        }
    }
}
