public class 비밀지도_1차 {
    public static void main(String[] args){
        Solution sol = new Solution();
        int n = 6;
        int[] arr1 = {0, 0, 0, 0, 0, 0};
        int[] arr2 = {1, 56, 19, 14, 14, 10};

        String[] answer = sol.solution(n, arr1, arr2);

        for (String string : answer) {
            System.out.println(string);
        }

    }

    public static class Solution{
        public String[] solution(int n, int[] arr1, int[] arr2){
            String[] answer = {};
            int[] result = new int[n];

            for(int i=0; i<n; i++){
                result[i] = arr1[i] | arr2[i];
            }

            answer = makeSecretMap(result);
            return answer;
        }

        public String[] makeSecretMap(int[] map){
            StringBuilder sb = new StringBuilder();
            String[] result = new String[map.length];
            int cell;
            int len;

            for(int i=0; i<map.length; i++){
                cell = map[i];

                while(cell > 0){
                    if (cell % 2 == 0){
                        sb.append(" ");
                    }
                    else{
                        sb.append("#");
                    }

                    cell /= 2;
                }

                len = sb.length();
                for (int j=0; j<map.length - len; j++){
                    sb.insert(sb.length(), ' ');
                }

                sb.reverse();
                result[i] = sb.toString();
                sb.delete(0, sb.length());
            }

            return result;
        }
    }
}
