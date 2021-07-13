import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 신규아이디추천 {
    public static void main(String args[]){
        System.out.println(Solution("z-+.^."));
    }

    public static String Solution(String new_id){
        String tmpStr = "";

        tmpStr = Step1(new_id);
        System.out.println("Step1 : " + tmpStr);
        tmpStr = Step2(tmpStr);
        System.out.println("Step2 : " + tmpStr);
        tmpStr = Step3(tmpStr);
        System.out.println("Step3 : " + tmpStr);
        tmpStr = Step4(tmpStr);
        System.out.println("Step4 : " + tmpStr);
        tmpStr = Step5(tmpStr);
        System.out.println("Step5 : " + tmpStr);
        tmpStr = Step6(tmpStr);
        System.out.println("Step6 : " + tmpStr);
        tmpStr = Step7(tmpStr);
        System.out.println("Step7 : " + tmpStr);

        return tmpStr;
    }

    public static String Step1(String new_id){
        return new_id.toLowerCase();
    }

    public static String Step2(String new_id){
        String strPattern = "[^a-z0-9-_.]*";
        String convStr = new_id.replaceAll(strPattern, "");

        return convStr;
    }

    public static String Step3(String new_id){
        String strPattern = "\\.{2,}";
        String convStr = new_id.replaceAll(strPattern, ".");

        return convStr;
    }

    public static String Step4(String new_id){
        String strPattern = "^[.]|[.]$";
        //String strPattern2 = "\\.$";
        String convStr = new_id.replaceAll(strPattern, "");
        //convStr = convStr.replaceAll(strPattern2, "");

        return convStr;
    }

    public static String Step5(String new_id){
        if (new_id.length() == 0)
            return "a";
        else
            return new_id;
    }

    public static String Step6(String new_id){
        String convStr = new_id;

        if (new_id.length() >= 16){
            convStr = new_id.substring(0, 15);
        }

        String strPattern = "\\.$";
        convStr = convStr.replaceAll(strPattern, "");

        return convStr;
    }

    public static String Step7(String new_id){
        String convStr = new_id;

        if (new_id.length() < 3){
            char tmpChr = new_id.toCharArray()[new_id.length() - 1];

            for(int i=0; i<3 - new_id.length(); i++){
                convStr += tmpChr;
            }
        }

        return convStr;
    }
}
