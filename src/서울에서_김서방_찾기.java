
public class ���￡��_�輭��_ã�� {
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
		      answer += ("�輭����"+" "+count+"�� �ִ�");
		      return answer;
		  }
		//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] seoul = {"Jane","Kim"};
		System.out.println(solution(seoul));
		

	}

}
