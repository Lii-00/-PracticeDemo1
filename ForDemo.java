/*
循环练习：
	1.100以内奇/偶数数和
	2.输出1-1000以内能被5整除的数，并保证每行输出5个
	3.使用循环实现将输入的十进制转化为二进制
	4.求取1!+2!+3!+···+10!之和
*/
import java.util.Scanner;

public class ForDemo{

	public static void main(String[] args){
		//1.100以内奇/偶数数和
		int oldSum = 0;				//100以内奇数和
		int evenSum = 0;			//100以内偶数和
		for(int i = 0;i < 100;i++){
			if(i % 2 == 0){
				evenSum += i;
			}else{
				oldSum += i;
			}
		}
		System.out.println("100以内奇数之和为：" + oldSum);
		System.out.println("100以内偶数之和为：" + evenSum);
		System.out.println();
		
		//2.输出1-1000以内能被5整除的数，并保证每行输出5个
		int count = 0;				//计数，达到5则进行换行
		for(int i = 0;i < 1000;i++){
			if(i % 5 == 0){
				count++;
				System.out.print(i+"\t");
			}
			if(count > 4){			//超出5时换行，并进行count清零
				System.out.println();
				count = 0;
			}	
		}
		System.out.println();
		
		//3.使用循环实现将输入的十进制转化为二进制
		Scanner sc = new Scanner(System.in);			//声明一个对象
		System.out.println("请输入十进制数：");
		int tenNumber = sc.nextInt();
		String twoNumber = "";							//声明一个存放二进制的空字符串，务必初始化
		while(tenNumber != 0){
			int i = tenNumber % 2;
			twoNumber = i + twoNumber;					//twoNumber=i+twoNumber,其中i与twoNumberw位置不容调换，保证后除得到的余数在高位
			tenNumber /= 2;
		}
		System.out.println("其二进制表示为：" + twoNumber);
		System.out.println();
		
		//4.求取1!+2!+3!+···+10!之和
		int facSum = 0;					//总计阶乘之和
		int sinSum = 1;					//单数阶乘之和
		for(int i = 1;i < 11;i++){
			for(int j = 1;j <= i;j++){
				sinSum *= j;			//实现阶乘
			}
			facSum += sinSum;
		}
		System.out.println("1-10的阶乘之和为：" + facSum);
	}

}