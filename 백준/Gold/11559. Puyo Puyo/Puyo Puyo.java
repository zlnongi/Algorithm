import java.io.*;
import java.util.*;

public class Main {
    public static int answer;
    public static char[][] field = new char[12][6];
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        for (int i=0; i<12; i++) {
            char[] input = br.readLine().toCharArray();

            for (int j=0; j<6;j++) {
                field[i][j] = input[j];
            }
        }

        while (puyo()) {    // 연쇄 일어나면
            answer++;
        }

        System.out.println(answer);


    }

    public static boolean puyo() {
        boolean isExploded = false;
        Queue<Node> q = new LinkedList<>();
        Queue<Node> buffer = new LinkedList<>();
        boolean[][] visited = new boolean[12][6];

        for (int i=0; i<12; i++) {
            for( int j=0; j<6; j++) {
                if (visited[i][j] || field[i][j] == '.') continue;

                // 색 큐에 넣기 시작 (continue 됐으므로)
                q.offer(new Node(i,j));
                visited[i][j] = true;

                buffer.clear();
                buffer.offer(new Node(i,j));

                char color = field[i][j];

                while(!q.isEmpty()) {
                    Node cur = q.poll();

                    for (int d=0; d<4; d++) {

                        int ny = cur.y + dy[d];
                        int nx = cur.x + dx[d];

                        if (nx >= 0 && ny >= 0 && nx < 6 && ny < 12 && !visited[ny][nx] && field[ny][nx] == color) {
                            q.offer(new Node(ny, nx));
                            buffer.offer(new Node(ny, nx));
                            visited[ny][nx] = true;
                        }
                    }
                }

                if (buffer.size() >=4) {
                    while(!buffer.isEmpty()){
                        Node cur = buffer.poll();
                        field[cur.y][cur.x] = '.';
                    }
                    isExploded = true;
                }
            }
        }

        List<Character> col = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            col.clear();
            for (int j = 11; j >= 0; j--) {
                if (field[j][i] != '.') {
                    col.add(field[j][i]);
                    field[j][i] = '.';
                }
            }

            int j = 11;
            for (char ch : col) {
                field[j--][i] = ch;
            }
        }

        return isExploded;

    }

    public static class Node {
        int y;
        int x;

        public Node (int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}
