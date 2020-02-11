
public class 수박수박수박수박수박수 {
	class Solution {
		  public String solution(int n) {
		      String answer = "";
		      String p = "��";
		      String q = "��";
		      for(int i = 1; i <=n; i++) {
		    	  if(i %2 ==0) {
		    		  answer += q;
		    	  }
		    	  else {
		    		  answer+=p;
		    	  }
		      }
		      return answer;
		  }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
