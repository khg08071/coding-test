
public class ���_����_�������� {
	class Solution {
		  public String solution(String s) {
		      String answer = "";
		      int md = s.length() / 2;
		      if(s.length()%2!=0) {
		    	  answer += s.charAt(md);
		      }
		      else {
		    	  
		    	  answer +=s.charAt(md-1);
		    	  answer +=s.charAt(md);
		      }
		      
		      return answer;
		  }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
