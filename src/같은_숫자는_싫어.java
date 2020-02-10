import java.util.*;
public class 같은_숫자는_싫어 {
	

	//public class Solution {
		public static int[] solution(int []arr) {
	        
	        boolean[] checkbox = new boolean[arr.length];
	        int count = 1;
	        for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if(i==arr.length-1 && j==arr.length-1) {
						checkbox[i] = true;
						count++;
					}
					if(i!=j) {
						if(i+1 == j) {
							if(arr[i] != arr[j]) {
								checkbox[i] = true;
								count++;
							}
						}
						
					}
					else {
						continue;
					}
				}
			}
	        int[] answer = new int[count-1];
	        int num = 0;
	        for (int i = 0; i < checkbox.length; i++) {
				if(checkbox[i] == true) {
					answer[num] = arr[i];
					num++;
				}
			}
	        

	        return answer;
		}
	//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t = {1,1,3,3,0,1,1};
		System.out.println(solution(t));

	}

}
