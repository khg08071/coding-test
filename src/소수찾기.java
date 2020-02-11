
public class 소수찾기{
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
