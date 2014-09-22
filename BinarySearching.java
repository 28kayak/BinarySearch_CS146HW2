
public class BinarySearching
{
	int low;
	int high;
	int target = 0;
	int[] sequence;
	BinarySearching(int[] seq)
	{
		sequence = seq;
		low = 0; 
		high = sequence.length-1;
		//target = x;	
	}
	public int search(int[] seq, int target)
	{
		return binarySearch(target,seq,low,high);
	}
	
	public int binarySearch(int target, int[] seq, int low, int high)
	{
		//PreCond: seq[0] <= a[1] <= ... <= seq[seq.length-1]; presorted
		//PostCond returns index, if index >= 0. then seq[index] == target
		if(low > high)
		{
			return -1;//base case
		}
		int index = (low + high)/2;
		if(seq[index] == target)
		{
			return index;
		}
		else if(seq[index] < target)
		{
			return binarySearch(target, seq, index+1, high);
		}
		else 
		{
			return binarySearch(target, seq, low, index-1);
		}
		
	}
	
	
	

}
