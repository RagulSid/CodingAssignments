// Problem 19
// Next problem : https://github.com/RagulSid/CodingAssignments/blob/main/Assignment%201/SumofDigits.java
// You are given the following information, but you may prefer to do some research for
// yourself

// ● 1 Jan 1900 was a Monday.
// ● Thirty days has September,
// ● April, June and November.
// ● All the rest have thirty-one,
// ● Saving February alone,
// ● Which has twenty-eight, rain or shine.
// ● And on leap years, twenty-nine.
// ● A leap year occurs on any year evenly divisible by 4, but not on a century
// unless it is divisible by 400.

// How many Sundays fell on the first of the month during the twentieth century (1 Jan
// 1901 to 31 Dec 2000)?

public class HowManySundays {

    public static int NoofSundays(int ystart, int yend){
        int count = 0;
        while(ystart <= yend) {
            for (int m = 1; m <= 12; m++) {
                if(dayOfWeek(ystart, m,1)==0){  //sunday
                    count++;
                }
            }
            ystart++;
        }
        return count;
    }

    public static int dayOfWeek(int year,int month,int day){
        
        //0 -> sunday
        //1 -> monday....6-> saturday
        int m = (month - 3 + 4800) % 4800;
		int y = (year + m / 12) % 400;
		m %= 12;
        int d = (y + y/4 - y/100 + (13 * m + 2) / 5 + day + 2) % 7;
		return d;
    }

    public static void main(String[] args) {
        System.out.println(NoofSundays(1901, 2000));
    }
}
