

public class 완주하지_못한_선수{
	class Solution {
	    public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        boolean[] checkbox_p = new boolean[participant.length];
	        boolean[] checkbox_c = new boolean[completion.length];
	        for (int i = 0; i < participant.length; i++) {
				for (int j = 0; j < completion.length; j++) {
					if(participant[i].equals(completion[j])) {
						if(checkbox_c[j] == true) {
							answer = participant[i];
							checkbox_p[i]=false;
						}
						if(checkbox_p[i]==true) {
							continue;
						}
						else {
							checkbox_p[i] = true;
							checkbox_c[j] = true;
						}
						
					}
				}
			}
	        
	        for (int i = 0; i < checkbox_p.length; i++) {
				if(checkbox_p[i] == false) {
					answer = participant[i];
				}
			}
	       
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}




