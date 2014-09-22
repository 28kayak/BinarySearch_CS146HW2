
public class ApplicationBiSearch
{
	public static void main(String[] arg)
	{
		int [] sequence = {22,33,44,55,66,77,88,99};
		printSequence(sequence);
		BinarySearching bSearch = new BinarySearching(sequence);
		System.out.println("search 44: "+ bSearch.search(sequence,44));
		System.out.println("search 65: "+ bSearch.search(sequence, 65));
		
		//System.out.println("search 44: " + binarySearch(44,sequence,lowIndex,hightIndex)+" th");
	}
	public static void printSequence(int[] seq)
	{
		String list = "{";
		for(int i = 0; i < seq.length; i++)
		{
			 list += seq[i];
			if(i != seq.length-1)
			{
				list = list + ",";
			}
			else
			{
				list = list + "}";
			}
		}//for
		System.out.println(list);
	}
}
