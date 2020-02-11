<<<<<<< HEAD


public class ë‚˜ëˆ„ì–´_ë–¨ì–´ì§€ëŠ”_ìˆ«ìž_ë°°ì—´ {
	class Solution {
		  public int[] solution(int[] arr, int divisor) {
		      int[] answer = new int[arr.length];
		      int[] solution;
		      int temp;
		      for(int i = 0; i<arr.length; i++) {
		    	  if(arr[i]%divisor == 0) {
		    		  answer[i] = arr[i]%divisor;
		    	  }
		      }
		      for (int i = 0; i < answer.length; i++) {
				for (int j = 0; j < answer.length; j++) {
					if(answer[i]>answer[j]) {
						temp = answer[i];
						answer[i]=answer[j];
						answer[j]=temp;
					}
				}
			  }
		      
		      
		      
		      return answer;
		      
		  }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
=======


public class ³ª´©¾î_¶³¾îÁö´Â_¼ýÀÚ_¹è¿­ {
	class Solution {
		  public int[] solution(int[] arr, int divisor) {
		      int[] answer = new int[arr.length];
		      int[] solution;
		      int temp;
		      for(int i = 0; i<arr.length; i++) {
		    	  if(arr[i]%divisor == 0) {
		    		  answer[i] = arr[i]%divisor;
		    	  }
		      }
		      for (int i = 0; i < answer.length; i++) {
				for (int j = 0; j < answer.length; j++) {
					if(answer[i]>answer[j]) {
						temp = answer[i];
						answer[i]=answer[j];
						answer[j]=temp;
					}
				}
			  }
		      
		      
		      
		      return answer;
		      
		  }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
>>>>>>> c4035c6de3ac4a267439f33dd7da39a60faca140
