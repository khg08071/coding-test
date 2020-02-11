<<<<<<< HEAD

public class ê°€ìš´ë°_ê¸€ìž_ê°€ì ¸ì˜¤ê¸°{
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
=======

public class °¡¿îµ¥_±ÛÀÚ_°¡Á®¿À±â {
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
>>>>>>> c4035c6de3ac4a267439f33dd7da39a60faca140
