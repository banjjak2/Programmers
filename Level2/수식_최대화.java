import java.util.*;

public class 수식_최대화 {
    public static void main(String[] args) {
        String expression = "177-661*999*99-133+221+334+555-166-144-551-166*166-166*166-133*88*55-11*4+55*888*454*12+11-66+444*99";
        수식_최대화 sol = new 수식_최대화();

        System.out.println(sol.solution(expression));
    }

    public long solution(String expression) {
        long answer = 0;
        String[] operators = {"+", "-", "*"};
        
        permutation(operators, expression, 0, operators.length, operators.length);

        answer = max;
        return answer;
    }
    
    long max = 0L;
    long result = 0L;
    public void permutation(String[] operators, String expression, int depth, int n, int r){
        if (depth == r){
            // System.out.println(Arrays.toString(operators));
            List<String> postfixResultList = convPostfix(expression, operators);
            result = postfixCalculate(postfixResultList);
            // System.out.println(result);
            if (max < result){
                max = result;
            }
        }
        else {
            for(int i=depth; i<n; i++){
                swap(operators, i, depth);
                permutation(operators, expression, depth+1, n, r);
                swap(operators, i, depth);
            }
        }
    }
    
    public void swap(String[] arr, int idx1, int idx2){
        String tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }
    
    public List<String> convPostfix(String expression, String[] operators){
        List<String> postfixList = new ArrayList<>();
        StringBuilder numberSb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        
        char c = ' ';
        int opPriority1 = 0;
        int opPriority2 = 0;
        for(int i=0; i<expression.length(); i++){
            c = expression.charAt(i);
            
            // 숫자면
            if (Character.isDigit(c)){
                numberSb.append(c);
                continue;
            }
            // 문자면
            else {
                postfixList.add(numberSb.toString());
                numberSb.delete(0, numberSb.length());
                
                if (stack.size() == 0){
                    stack.push(String.valueOf(c));
                    continue;
                }
                // 스택의 연산자가 현재 연산자보다 더 우선순위가 낮거나 같을 경우 스택에 추가
                else {
                    // 스택의 연산자가 현재 연산자보다 더 우선순위가 높을 경우 우선순위가 높은 연산자를 스택에서 빼서 표현
                    while(!stack.isEmpty()){
                        opPriority1 = Arrays.asList(operators).indexOf(stack.peek());
                        opPriority2 = Arrays.asList(operators).indexOf(String.valueOf(c));
                        if (opPriority1 >= opPriority2){
                            postfixList.add(stack.pop());
                        }
                        else{
                            break;
                        }
                    }
                }
                
                stack.push(String.valueOf(c));
            }
        }

        if (numberSb.length() != 0){
            postfixList.add(numberSb.toString());
        }

        while(!stack.isEmpty()){
            postfixList.add(stack.pop());
        }
        
        return postfixList;
    }

    public long postfixCalculate(List<String> postfix){
        Stack<String> stack = new Stack<>();
        long op1 = 0L;
        long op2 = 0L;

        for(int i=0; i<postfix.size(); i++){
            // 숫자면
            if (Character.isDigit(postfix.get(i).charAt(0))){
                stack.push(postfix.get(i));
            }
            // 연산자면
            else {
                op2 = Long.valueOf(stack.pop());
                op1 = Long.valueOf(stack.pop());

                switch (postfix.get(i)){
                    case "+":
                        stack.push(String.valueOf(op1 + op2));
                        break;

                    case "-":
                        stack.push(String.valueOf(op1 - op2));
                        break;

                    case "*":
                        stack.push(String.valueOf(op1 * op2));
                        break;
                }
            }
        }

        return Math.abs(Long.valueOf(stack.pop()));
    }
}
