package ques3;

public class DarkStar extends Star{
	private int index;
	int c;
	int result=0; 
	public DarkStar(String starname, String constelname, int decayindex, int energyemit, int age,int energyconsume) {
		super(starname,constelname,age,energyemit,energyconsume);
		index=decayindex;
	}
	int  calculateyears()
	{
		int num=1,i;
	    int count=0;
	 
	    while (count < index){
	      num=num+1;
	      for (i = 2; i <= num; i++){ 
	        if (num % i == 0) {
	          break;
	        }
	      }
	      if ( i == num){
	        count = count+1;
	      }
	    }
	    result=result + num;
	    return result;
	}

}