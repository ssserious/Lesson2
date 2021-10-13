/**
* Java 1. Lesson 2
*@autor Sergey Sergeev
*@version 13.10.2021
*/

class Lesson2 {
	
    public static void main(String[] args) {
    within10and20(9,10);
	isPositiveOrNegative(-5);
	isNegative(-1);
	printWordNTimes("haip",3);
	}	
		
		
	public static boolean within10and20(int a, int b){
	   int sum = a + b;
       return sum > 10 && sum <= 20;
    }

    public static void isPositiveOrNegative(int a) {
       System.out.println(a >= 0? "pozitiv" : "negativ");
	}
	
	public static boolean isNegative(int a) {
        return (a > 0);
    }
	
    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
        System.out.println(word);
    }
	}
}
	
