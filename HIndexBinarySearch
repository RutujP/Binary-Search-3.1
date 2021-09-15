 // Time Complexity : O(logN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Nope, but approach is bit complex


// Your code here along with comments explaining your approach
/*
Approach:
1) we try to calculate the HIndex uisng binary search as we have papers lined up from 1 to N (sorted order)
2) here we see we first calculate the mid value and then check n-mid ==citations[mid]
-> same as how we use to check the difference n-i;
-> here we check with mid (to search only one half of array)
3) if citations[mid]>n-mid 
this indicates citations are more than number of papers
-> thus we need to move left 
-> else move right for vice versa condn 

in the end we have n-low as we cant return just low, as low is only the indice


*/


class HIndexBinarySearch {
    public int hIndex(int[] citations) {
      // using binary search
    
        int n = citations.length;
        
        int low = 0;
        int high = n-1;
        
        while(low<=high)
        {
            
            int mid =low +(high-low)/2;
            
            if(citations[mid]==n-mid)
            {
                return n-mid;
                
            }
            else
                if(citations[mid]>n-mid) // look for lower values -> go to left side
                {
                    high = mid-1;
                }
            else
            {
                low = mid+1;
            }
        }
        
        return n-low;
        
    }
}