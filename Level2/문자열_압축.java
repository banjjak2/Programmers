public class 문자열_압축{
    public static void main(String[] args) {
        String s = "aaaaaaaaa";

        System.out.println(solution(s));
    }

    public static int solution(String s){
        int answer = 0;
        StringBuilder sb = new StringBuilder(s);
        int min = s.length();
        int splitCount = 1;
        int correctCount = 0;
        String curSplitStr = "";
        String nextSplitStr = "";

        // 최대 문자열/2 로 나눈 만큼만 확인 (절반이 넘어가면 뒷 문자는 개수가 모자름)
        for(int i=0; splitCount<=s.length() / 2; i++){
            correctCount = 0;

            // 자를 문자열 개수만큼 반복
            for(int j=splitCount; j<=s.length(); j+=splitCount){
                // 현재 문자열 확인
                curSplitStr = sb.substring(j - splitCount, j);

                // 지금까지 확인한 문자열의 길이가 전체 문자열 길이보다 작거나 같으면 
                // 남아있는 문자열의 길이가 splitCount 보다 크기 때문에 더 자를 수 있고
                if (j + splitCount <= s.length()){
                    nextSplitStr = sb.substring(j, j + splitCount);
                }else{
                    // 확인한 문자열의 길이가 전체 문자열 길이보다 크면 남아있는 문자열의 길이가 splitCount 보다 작기 때문에
                    // 현재 위치에서 끝까지의 문자열을 구한다.
                    nextSplitStr = sb.substring(j, sb.length());
                }

                // 현재와 다음의 문자열이 같을 때만 길이를 더해줌
                if (curSplitStr.equals(nextSplitStr)){
                    correctCount++;
                }else{
                    if (correctCount >= 1){
                        correctCount++;
                        answer += String.valueOf(correctCount).length();
                        answer += curSplitStr.length();
                    }else{
                        answer += curSplitStr.length();
                    }
                    
                    // 다음 문자열의 길이가 자를 개수보다 작으면 끝난것으로 간주하고 개수를 더해줌
                    if (nextSplitStr.length() < splitCount){
                        answer += nextSplitStr.length();
                    }

                    correctCount = 0;
                }
                //System.out.println(String.format("curSplitStr : %s, nextSplitStr : %s", curSplitStr, nextSplitStr));

            }
            //System.out.println(String.format("sbAnswer : %s, length : %d", sbAnswer.toString(), sbAnswer.length()));

            if (answer < min){
                min = answer;
            }
            answer = 0;
            splitCount++;
        }
        answer = min;
        return answer;
    }
}