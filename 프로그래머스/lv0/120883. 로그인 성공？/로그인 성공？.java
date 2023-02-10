class Solution {
    public String solution(String[] id_pw, String[][] db) {
        //id_pw[0] = 아이디, id_pw[1] = 패스워드

        
        for(int i=0 ; i<db.length ; i++){
            if(id_pw[0].equals(db[i][0])){ 
                if(id_pw[1].equals(db[i][1])){
                    return "login"; //아이디와 패스워드 둘 다 동일
                }
                else{
                    return "wrong pw"; //패스워드만 틀림
                }
            }
        }
            return "fail";
    }
}