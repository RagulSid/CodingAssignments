// Problem 14
// Next problem : https://github.com/RagulSid/CodingAssignments/blob/main/Assignment%201/FindingRoutes.java
// The following iterative sequence is defined for the set of positive integers:

//     n → n/2 (n is even)
//     n → 3n + 1 (n is odd)

// Using the rule above and starting with 13, we generate the following sequence:
//     13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

// It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
// Although it has not been proved yet (Collatz Problem), it is thought that all starting
// numbers finish at 1.

// Which starting number, under one million, produces the longest chain?

import java.util.ArrayList;
public class LongestChain {
    public static void main(String[] args) {
		ArrayList<Long> list = new ArrayList<Long>();
		long length = 0;
		int res = 0;

		for(int j = 10; j < 1000000; j++)
		{
			long i = j;
			while (i != 1)
			{
				if (i % 2 == 0)
				{
					i /= 2;
					list.add(i);
				}
				else
				{
					i = (3 * i) + 1;
					list.add(i);
				}
			}
			if(list.size() > length)
			{
				length = list.size();
				res = j;
			}
			list.clear();
		}
		System.out.println(res);
	}
}