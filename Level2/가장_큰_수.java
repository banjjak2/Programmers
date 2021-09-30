import java.util.*;

public class 가장_큰_수 {
    public static void main(String[] args) {
        가장_큰_수 sol = new 가장_큰_수();
        int[] numbers = {
            0, 0, 1, 0, 0
        };

        System.out.println(sol.solution(numbers));
    }

    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] strArr = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            strArr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strArr, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                if (Long.valueOf(o1 + o2) < Long.valueOf(o2 + o1)){
                    return -1;
                }else if (Long.valueOf(o1 + o2) > Long.valueOf(o2 + o1)){
                    return 1;
                }

                return 0;
            }
        });

        if (strArr[strArr.length - 1].equals("0")){
            return "0";
        }
        
        String tmp = "";
        for(int i=strArr.length-1; i>=0; i-=2){
            if (i == 0){
                tmp = strArr[i];
            }
            else{
                tmp = strArr[i] + strArr[i-1];
            }

            answer.append(tmp);
        }

        return answer.toString();
    }
}
