import java.util.*;

public class 거리두기_확인하기 {
    public static void main(String[] args) {
        String[][] places = {
            {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, 
            {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, 
            {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, 
            {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, 
            {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
        };

        거리두기_확인하기 sol = new 거리두기_확인하기();
        int[] answer = sol.solution(places);

        for (int i : answer) {
            System.out.println(i);
        }
    }

    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        List<Pos> players = new ArrayList<Pos>();
        List<Pos> partitions = new ArrayList<Pos>();

        for(int i=0; i<places.length; i++){
            getPlayerAndPartitionPos(places[i], players, partitions, answer, 0);
            isSocialDistance(players, partitions, answer, 0);
            
            if (isOK){
                answer[i] = 1;
            }
            else {
                answer[i] = 0;
            }

            isOK = true;
        }

        return answer;
    }

    boolean isOK = true;
    public void isSocialDistance(List<Pos> players, List<Pos> partitions, int[] answer, int index){
        if (index == players.size() - 1
        || isOK != true
        || players.size() == 0
        )
        {
            return;
        }

        Pos curPos = players.get(index);
        Pos nextPos = null;
        int row = curPos.row;
        int column = curPos.column;
        for(int i=index; i<players.size() - 1; i++){
            nextPos = players.get(i + 1);

            int distance = manhathan(curPos, nextPos);
            Pos tmpPos = new Pos(curPos.row, curPos.column);
            if (distance <= 2){
                // Row만 다른경우
                if (curPos.row != nextPos.row && curPos.column == nextPos.column){
                    if (curPos.row < nextPos.row){
                        row++;
                    }
                    else {
                        row--;
                    }
                    
                    tmpPos.row = row;
                    tmpPos.column = curPos.column;

                    if (!checkPartitions(partitions, tmpPos)){
                        isOK = false;
                    }
                }
                // Column만 다른경우
                else if (curPos.column != nextPos.column && curPos.row == nextPos.row){
                    if (curPos.column < nextPos.column){
                        column++;
                    }
                    else {
                        column--;
                    }

                    tmpPos.row = curPos.row;
                    tmpPos.column = column;

                    if (!checkPartitions(partitions, tmpPos)){
                        isOK = false;
                    }
                }
                // 둘 다 다른경우
                else {
                    if (curPos.row < nextPos.row){
                        tmpPos.row = tmpPos.row + 1;
                    }
                    else {
                        tmpPos.row = tmpPos.row - 1;
                    }

                    if (!checkPartitions(partitions, tmpPos)){
                        isOK = false;
                    }

                    Pos tmpPos2 = new Pos(curPos.row, curPos.column);
                    if (curPos.column < nextPos.column){
                        tmpPos2.column = tmpPos.column + 1;
                    }
                    else {
                        tmpPos2.column = tmpPos.column - 1;
                    }

                    if (!checkPartitions(partitions, tmpPos2)){
                        isOK = false;
                    }
                }
            }
        }

        isSocialDistance(players, partitions, answer, index + 1);
    }

    public boolean checkPartitions(List<Pos> partitions, Pos pos){
        for(int i=0; i<partitions.size(); i++){
            if (partitions.get(i).equals(pos)){
                return true;
            }
        }
        return false;
    }

    public int manhathan(Pos pos1, Pos pos2){
        int result = 0;
        result = Math.abs(pos2.row - pos1.row) + Math.abs(pos2.column - pos1.column);
        return result;
    }

    public void getPlayerAndPartitionPos(String[] room, List<Pos> players, List<Pos> partitions, int[] answer, int k){
        players.clear();
        partitions.clear();

        for(int i=0; i<room.length; i++){
            for(int j=0; j<room[i].length(); j++){
                if (room[i].charAt(j) == 'P'){
                    players.add(new Pos(i, j));
                }
                else if (room[i].charAt(j) == 'X'){
                    partitions.add(new Pos(i, j));
                }
            }
        }
    }

    public class Pos {
        int row;
        int column;

        public Pos(int row, int column){
            this.row = row;
            this.column = column;
        }

        public Pos() {
            row = 0;
            column = 0;
        }

        @Override
        public boolean equals(Object obj) {
            Pos pos = (Pos)obj;
            if (row == pos.row && column == pos.column){
                return true;
            }
            else{ 
                return false;
            }
        }
    }
}
