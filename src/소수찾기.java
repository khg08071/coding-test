<<<<<<< HEAD

public class ì†Œìˆ˜ì°¾ê¸°{
	class Solution {
		  public int solution(int n) {
		      int answer = 0;
		      for(int i = 2; i<=n;i++) {
		    	  if(isPrime(i) == true) {
		    		  answer +=1;
		    	  }
            }
		      return answer;
		  }
		  public boolean isPrime(int n) {
			  int i = 2;
			  boolean num = true;
			  while(i<n) {
				  if(n%i == 0) {
					  num = false;
					  break;
				  }
				  i++;
			  }
			  return num;
		  }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
=======

public class ¼Ò¼öÃ£±â {
	class Solution {
		  public int solution(int n) {
		      int answer = 0;
		      for(int i = 2; i<=n;i++) {
		    	  if(isPrime(i) == true) {
		    		  answer +=1;
		    	  }
            }
		      return answer;
		  }
		  public boolean isPrime(int n) {
			  int i = 2;
			  boolean num = true;
			  while(i<n) {
				  if(n%i == 0) {
					  num = false;
					  break;
				  }
				  i++;
			  }
			  return num;
		  }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
>>>>>>> c4035c6de3ac4a267439f33dd7da39a60faca140
