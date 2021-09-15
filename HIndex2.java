// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Nope


// Your code here along with comments explaining your approach
/*Approach:
1) H index means that we have papers from 1 to N and every paper has citations i.e thus we need to find such a h index that, atleast the array shoudl contain the citations >= the hindex
[0,1,3,5,6]
if we choose 3 as h-index, there should be atleast 3 elements in array whose citation is >=3 and n=citation.length 
-> & n-h-Index
-> 5-3=2, that means 2 values in array whose values are less than h-index value 
-> in this manner 3 is the H-index of the array 

2) thus we sum up the same 
-> first we calculate (n-i) as the difference.
then we check with the citations[i]>=diff
-> if that is the case we return the diff 
-> else return 0

*/


public class HIndex2 {
    public int hIndex(int[] citations) {
      
        if(citations==null || citations.length==0)
        {
            return 0;
        }
        
        int n = citations.length;
        
        for(int i=0;i<n;i++)
        {
            // we calculate the differerence n-i
            int diff = n-i;
            
            
            // this checks for number of elements <= the citation which we have chosen 
            if(citations[i]>=diff)
            {
                return diff;
            }
            
            
        }
        
        return 0;
    }
}
