import java.util.*;

public class 전화번호_목록 {
    public static void main(String[] args) {
        String phone_book[] = 
        {
            "119", 
            "97674223", 
            "1195524421"
        };

        전화번호_목록 sol = new 전화번호_목록();

        System.out.println(sol.solution(phone_book));
    }

    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        
        for(int i=0; i<phone_book.length; i++){
            for(int j=i + 1; j<phone_book.length; j++){
                if (phone_book[j].indexOf(phone_book[i]) == 0){
                    return false;
                }
                else{
                    break;
                }
            }
        }

        return true;
    }

    // public boolean solution(String[] phone_book) {
    //     boolean answer = true;
    //     HashMap<String,Integer> h =new HashMap<>();
    //     for(String s : phone_book) {
    //         h.put(s, h.getOrDefault(s,0)+1);
    //     }

    //     for(String s : phone_book) {
    //         for(int j=1; j<s.length(); j++) {
    //             if(h.containsKey(s.substring(0,j))) {
    //                answer = false; 
    //                break;
    //             }              
    //         }
    //     }    



    //     return answer;
    // }
}
