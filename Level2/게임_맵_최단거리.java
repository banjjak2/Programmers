import java.util.*;

public class 게임_맵_최단거리 {
    public static void main(String[] args) {
        // int[][] maps = {
        //     {1,0,1,1,1},
        //     {1,0,1,0,1},
        //     {1,0,1,1,1},
        //     {1,1,1,0,1},
        //     {0,0,0,0,1}
        // };

        int[][] maps = {
            {1,0,1,1,1},
            {1,0,1,0,1},
            {1,0,1,1,1},
            {1,1,1,0,0},
            {0,0,0,0,1}
        };

        // int[][] maps = {
        //     {1,0,1,1,1},
        //     {1,0,1,0,1},
        //     {1,1,1,1,1},
        //     {0,0,0,0,1}
        // };

        게임_맵_최단거리 sol = new 게임_맵_최단거리();
        System.out.println(sol.solution(maps));
    }

    public int solution(int[][] maps) {
        int answer = 0;
        Pos pos = new Pos(0, 0);
        int n = maps[0].length; // 가로
        int m = maps.length; // 세로

        answer = BFS(maps, pos, m, n);

        return answer;
    }

    public class Pos {
        public int x;
        public int y;

        public Pos(int x, int y){
            this.x = x;
            this.y = y;
        }

        public Pos(){
            this.x = 0;
            this.y = 0;
        }
    }

    public int BFS(int[][] maps, Pos startPos, int m, int n){
        boolean[][] visited = new boolean[m][n];
        Queue<Pos> queue = new LinkedList<>();
        boolean complete = false;
        int[][] direction = {
            // 상
            {-1, 0},
            // 하
            {1, 0},
            // 좌
            {0, -1},
            // 우
            {0, 1}
        };

        queue.add(startPos);
        visited[startPos.y][startPos.x] = true;

        Pos pos = null;
        Pos tmpPos = null;

        while(queue.size() != 0){
            pos = queue.poll();

            for(int i=0; i<direction.length; i++){
                tmpPos = new Pos(pos.x + direction[i][1], pos.y + direction[i][0]);

                // 상, 하, 좌, 우에 길이 있고 방문하지 않았다면
                if (checkDirection(maps, tmpPos, m, n) && !checkVisit(tmpPos, visited)){
                    visited[tmpPos.y][tmpPos.x] = true;
                    // 이전 위치의 값에 1을 더해 현재 위치의 값으로 설정
                    // 최종적으로 몇 칸을 이동해야하는지 확인하기 위해
                    maps[tmpPos.y][tmpPos.x] = maps[pos.y][pos.x] + 1;
                    queue.add(tmpPos);
                }

                if (tmpPos.x == n - 1 && tmpPos.y == m - 1){
                    complete = true;
                    break;
                }
            }
        }

        if (complete){
            return maps[m - 1][n - 1];
        }
        else {
            return -1;
        }
    }

    public boolean checkDirection(int[][] maps, Pos pos, int m, int n){
        // x값이 범위 내에 있는지
        if (pos.x < 0 || pos.x >= n){
            return false;
        }
        // y값이 범위 내에 있는지
        else if (pos.y < 0 || pos.y >= m){
            return false;
        }

        // 벽인지
        if (maps[pos.y][pos.x] == 0){
            return false;
        }
        // 길인지
        else {
            return true;
        }
    }

    public boolean checkVisit(Pos pos, boolean[][] visited){
        // 방문했는지
        if (visited[pos.y][pos.x]){
            return true;
        }
        // 방문하지 않았는지
        else {
            return false;
        }
    }
}
