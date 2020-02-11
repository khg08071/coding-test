
public class 서울에서_김서방_찾기 {
	//class Solution {
		  public static String solution(String[] seoul) {
		      String answer = "";
		      int count = 0;
		      for(String s : seoul) {
		    	  if(s.equals("Kim")) {
		    		  break;
		    	  }
		    	  count++;
		      }
		      answer += ("김서방은"+" "+count+"에 있다");
		      return answer;
		  }
		//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] seoul = {"Jane","Kim"};
		System.out.println(solution(seoul));
		

	}

}
