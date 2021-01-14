package model;

public class InchCmLogic {
	public void execute(InchCm size){
		String[] sizes=size.getInch();
		int first=Integer.parseInt(sizes);
		int max,min,sum;
		max=min=sum=first;
		
		for(int i=1;i<nums.length;i++){
			int pick=Integer.parseInt(nums[i]);
			if(pick>max){
				max=pick;
			}
			if(pick<min){
				min=pick;
			}
			sum+=pick;
		}
		size.setCm(cm);
	}
}