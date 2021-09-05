public class 제일_작은_수_제거하기 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};

        int[] answer = solution(arr);
        for (int i : answer) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] arr){
        int[] answer = {};
        int min = arr[0];
        int minCount = 0;
        int size = 0;

        for (int i : arr) {
            if (min > i){
                min = i;
                minCount = 0;
            }else if (min == i){
                minCount++;
            }
        }

        size = arr.length - minCount - 1;
        if (size <= 0){
            return new int[] { -1 };
        }

        answer = new int[size];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] == min){
                continue;
            }

            answer[index++] = arr[i];
        }

        return answer;
    }
}
