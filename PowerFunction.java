/*
Problem Statement : Implement pow(x, n) % d.  In other words, given x, n and d,  find (xn % d)
		    Note that remainders on division cannot be negative.  In other words, make sure the answer you return is non negative.
*/

public class Solution {
	public int pow(int x, int n, int d) {
	    
	    //int x1 = x % d; // reduce the x to the range of d
	    
	    int ans = 1;
	    int square = x;
	    
	    if(n == 0)
	        return 1;
	    
	    while(n != 0){
	        
	        if(n%2 == 1)
	            ans *= square;
	            
	        n /= 2;
	        square = (square * square) % d;
	        
	        if(ans > d)
	            ans = ans % d;
	    }
	   
	   return ans; 
	}
}


