class Solution {
    public static int max = 1_000_000;
    
    public static int[][] edges;
    public static int[] input;
    public static int[] output;
    
    public int[] solution(int[][] edges) {
        this.edges = edges;
        
        input = new int[max + 1];  //  받은 것 (진입)
        output = new int[max + 1];   // 준 것 (진출)
        
        int maxNode = 0;
        for (int[] e : edges) {
            input[e[1]]++;
            output[e[0]]++;
            
            maxNode = Math.max(maxNode, Math.max(e[0], e[1]));
        }
        
        int[] answer = new int[4];
        
        for (int i=1; i<=maxNode; i++) {
            if (input[i] == 0 && output[i] >= 2) {  // 정점
                answer[0] = i;
            } else if (input[i] > 0 && output[i] == 0) {  // 막대모양
                answer[2]++;
            } else if (input[i] >= 2 && output[i] >= 2) {   // 8자 모양
                answer[3]++;
            }
                
        }
        
        answer[1] = output[answer[0]] - (answer[2]+answer[3]);  // 도넛 모양
        
        return answer;
    }
}