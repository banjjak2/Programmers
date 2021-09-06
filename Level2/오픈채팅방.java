import java.util.*;

public class 오픈채팅방{
    public static void main(String[] args) {
        String[] record = {
            "Enter uid1234 Muzi", 
            "Enter uid4567 Prodo",
            "Leave uid1234",
            "Enter uid1234 Prodo",
            "Change uid4567 Ryan",
        };

        String[] answer = solution(record);

        for (String str : answer) {
            System.out.println(str);
        }
    }

    public static String[] solution(String[] record){
        String[] answer ={};
        Manager mgr = new Manager();

        answer = mgr.getUserLogs(record);

        return answer;
    }

    public static class Manager{
        private static List<UserLog> userLogList = new ArrayList<UserLog>();
        private static UserTable userTable = new UserTable();

        // 사용자의 uid, nickname 저장
        static class UserTable{
            static HashMap<String, String> users = new HashMap<String, String>();
            void addUser(String uid, String nickname){
                users.put(uid, nickname);
            }
    
            String getUserNickname(String uid){
                return users.getOrDefault(uid, null);
            }
        }

        // 사용자들 입/퇴장 처리 부분
        public class UserLog{
            String cmd;
            String uid;
            String changeNickname;

            public UserLog(String cmd, String uid){
                this.cmd = cmd;
                this.uid = uid;

                userLogList.add(this);
            }

            public UserLog(String cmd, String uid, String changeNickname){
                this.cmd = cmd;
                this.uid = uid;
                this.changeNickname = changeNickname;

                userTable.addUser(uid, changeNickname);
            }
        }

        public String[] getUserLogs(String[] record){
            String[] splits;

            for (String str : record) {
                UserLog userLog;
                splits = str.split(" ");

                switch (splits[0]) {
                    case "Enter":
                        userTable.addUser(splits[1], splits[2]);
                        userLog = new UserLog(splits[0], splits[1]);
                        break;

                    case "Change":
                        userLog = new UserLog(splits[0], splits[1], splits[2]);
                        break;

                    case "Leave":
                        userLog = new UserLog(splits[0], splits[1]);
                        break;
                }
            }

            return printLog();
        }

        static String[] printLog(){
            String[] logs = new String[userLogList.size()];
            UserLog userLog;
            
            for(int i=0; i<logs.length; i++){
                userLog = userLogList.get(i);
                switch(userLog.cmd){
                    case "Enter":
                        logs[i] = String.format("%s님이 들어왔습니다.", userTable.getUserNickname(userLog.uid));
                        break;

                    case "Change":
                        userTable.addUser(userLog.uid, userLog.changeNickname);
                        break;

                    case "Leave":
                        logs[i] = String.format("%s님이 나갔습니다.", userTable.getUserNickname(userLog.uid));
                        break;
                }
            }

            return logs;
        }
    }
}