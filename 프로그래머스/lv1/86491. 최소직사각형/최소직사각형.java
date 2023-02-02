class Solution {
    public int solution(int[][] sizes) {
        int width=0; //가로길이
        int height=0; //세로길이
        
        for(int i=0 ; i<sizes.length ; i++){
            int tmp=0; 
            //명함의 모서리 중 긴 쪽을 전부 가로로 돌리기
            if(sizes[i][0]<sizes[i][1]){
                tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        
        for(int i=0 ; i<sizes.length ; i++){
            if(sizes[i][0]>width) width=sizes[i][0];
            if(sizes[i][1]>height) height=sizes[i][1];
        }
        return width*height;
    }
}