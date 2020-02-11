<<<<<<< HEAD

public class ì‹œì €_ì•”í˜¸ {
	//class Solution {
		  public static String solution(String s, int n) {
		      String answer = "";
		      char[] string = new char[s.length()];
		      for (int i = 0; i < string.length; i++) {
				string[i] = s.charAt(i);
			}
		      for (int i = 0; i < string.length; i++) {
		    	  if(string[i]>='a' && string[i]<='z') {
		    		  if((int)(string[i]+n) > (int)('z')) {
			    		  string[i] = (char)((int)(string[i]+n) - (int)('z')+(int)('a')-1);
			    		  
			    		  answer += string[i];
			    	  }
			    	  else {
			    		  answer += (char)(string[i]+n);
			    	  }
		    	  }
		    	  else if(string[i] == ' ') {
		    		  answer+=' ';
		    		  }
		    	  else {
		    		  if(string[i]+n > 'Z') {
			    		  string[i] = (char)((int)(string[i]+n) - (int)('Z')+(int)('A')-1);
			    		  answer += string[i];
			    		  }
			    	  else {
			    		  answer += (char)(string[i]+n);
			    		  }
		    		  }
		    	  }
		      return answer;
		  }
		//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "AB";
		String test_ = "z";
		String test_1 = "a B z";
		System.out.println(solution(test, 25));
		//System.out.println(solution(test_, 1));
		//System.out.println(solution(test_1, 4));
		

	}

}
=======

public class ½ÃÀú_¾ÏÈ£ {
	//class Solution {
		  public static String solution(String s, int n) {
		      String answer = "";
		      char[] string = new char[s.length()];
		      for (int i = 0; i < string.length; i++) {
				string[i] = s.charAt(i);
			}
		      for (int i = 0; i < string.length; i++) {
		    	  if(string[i]>='a' && string[i]<='z') {
		    		  if((int)(string[i]+n) > (int)('z')) {
			    		  string[i] = (char)((int)(string[i]+n) - (int)('z')+(int)('a')-1);
			    		  
			    		  answer += string[i];
			    	  }
			    	  else {
			    		  answer += (char)(string[i]+n);
			    	  }
		    	  }
		    	  else if(string[i] == ' ') {
		    		  answer+=' ';
		    		  }
		    	  else {
		    		  if(string[i]+n > 'Z') {
			    		  string[i] = (char)((int)(string[i]+n) - (int)('Z')+(int)('A')-1);
			    		  answer += string[i];
			    		  }
			    	  else {
			    		  answer += (char)(string[i]+n);
			    		  }
		    		  }
		    	  }
		      return answer;
		  }
		//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "AB";
		String test_ = "z";
		String test_1 = "a B z";
		System.out.println(solution(test, 25));
		//System.out.println(solution(test_, 1));
		//System.out.println(solution(test_1, 4));
		

	}

}
>>>>>>> c4035c6de3ac4a267439f33dd7da39a60faca140
