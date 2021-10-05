public class 조이스틱 {
    public static void main(String[] args) {
        String name = "ABAAAABAAAAAAAAAAAAB";

        조이스틱 sol = new 조이스틱();

        System.out.println(sol.solution(name));
    }


    public int solution(String name) {
        int answer = 0;
        int notA_Count = 0;
        int curCount = 0;
        int lastIndex = 0;
        char curChar = 'A';
        boolean leftSmallerThanRight = false;

        // A가 아닌 개수 및 A가 아닌 마지막 인덱스 구하기
        for(int i=0; i<name.length(); i++){
            if (name.charAt(i) != 'A'){
                lastIndex = i;
                notA_Count++;
            }
        }

        // 오른쪽으로 갈 수 있는 최대 구하기
        // 인덱스 0을 기준으로 왼쪽으로 갔을 때 몇번째 값이 A가 아닌지 확인 (0의 위치에서 왼쪽으로 갈 경우 거리값이 +1이 되어야 함)
        int leftCount = name.length() - lastIndex;
        int rightCount = 0;
        int curPos = 0;
        int upDownCount = 0;
        for(int i=0; i<name.length(); i++){
            curChar = name.charAt(i);
            if (curChar == 'A'){
                continue;
            }

            // i 위치에서 현재 위치를 빼면 오른쪽으로 몇 번 가야 A가 아닌 문자가 나오는지 알 수 있음
            rightCount = i - curPos;

            // A가 아닌 문자를 만나기 위해 오른쪽으로 간 횟수와 왼쪽으로 간 횟수를 비교
            // 왼쪽으로 간 횟수가 더 적을 경우 빠져나와 맨 오른쪽에서 왼쪽으로 진행하기 위해 빠져나옴
            if (rightCount > leftCount + curPos){
                leftSmallerThanRight = true;
                break;
            }
            else{
                answer += rightCount;
            }

            // 알파벳 구하기
            upDownCount = (curChar - 'A' > 'Z' - curChar + 1)? 'Z' - curChar + 1 : curChar - 'A';
            answer += upDownCount;

            // 현재 위치를 i번째로 옮김
            curPos = i;
            rightCount = 0;
            curCount++;
        }

        // 현재 위치에서 왼쪽으로 가는게 더 빠른 경우가 있을 때
        // 현재 위치부터 왼쪽으로 구해야 하니까 leftCount는 curPos 값으로 변경
        leftCount = curPos;
        if (leftSmallerThanRight){
            for(int i=name.length() - 1; i>=0; i--){
                if (notA_Count == curCount){
                    break;
                }

                curChar = name.charAt(i);
                // A면 한 칸 이동
                if (curChar == 'A'){
                    leftCount++;
                    continue;
                }
                leftCount++;

                upDownCount = (curChar - 'A' > 'Z' - curChar + 1)? 'Z' - curChar + 1 : curChar - 'A';
                answer += upDownCount;
                answer += leftCount;
                leftCount = 0;
                curCount++;
            }
        }

        return answer;
    }
}
