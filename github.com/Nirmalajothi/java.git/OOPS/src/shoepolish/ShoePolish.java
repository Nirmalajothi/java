package shoepolish;

public class ShoePolish {
		
		public int Polish(int CP) {
			
			int i=0;
			if(CP==5)
			{
				i=100;
			}
			else 
			{
				System.out.println("100ml for 5 pieces of coal");
				i=0;
			}
			return i;
			
		}
		public int Polish(float HS) {
			int k=0;
			if(HS==(float)9.83)
			{
				k= 100;
			}
			else
			{
				System.out.println("100ml for 9.83m HS");
				k=0;
			}
			return k;
		}
		public int Polish(String CM) {
			int count=0;
			int j=0;
			String[] s=CM.split(" ");
			
			for(int i=0;i<s.length;i++) {
				
			if(s[i].equalsIgnoreCase("coal"))
				count++;
				
		}
			if(count==27)
			{
				j=100;
			}
			else
			{
				System.out.println("Input is not 27 coal writeen in paper");
				j=0;
			}
		
			return j;
		}
		
	}

