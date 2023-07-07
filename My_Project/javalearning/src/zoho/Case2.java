package zoho;

public class Case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr [] = {12,31,10,6,40};
	      int sum =0;
	      int biggest = 0;
	      for(int i = 0; i< arr.length;i++)
	      {
	    	  sum+=arr[i];
	    	  if(sum > biggest)
	    	  {
	    		  biggest = sum;
	    	  }
	    	  sum = arr[i];
	    	  //System.out.println(arr[i]);
	      }
	      System.out.println(biggest);

	}

}
