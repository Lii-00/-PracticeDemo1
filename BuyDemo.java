/*
循环练习

*/
import java.util.Scanner;			//导包

public class BuyDemo{

	public static void main(String[] args){
		System.out.println("********************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤\t\t2.网球鞋\t\t3.网球拍");
		System.out.println("********************************");
		
		Scanner sc = new Scanner(System.in);			//声明一个对象
		float singleSum = 0.0f;								//单品合计金额
		float sum = 0.0f;									//所有商品总计金额
		
		while(true){
			System.out.println("\n请输入商品编号：");
			int id = sc.nextInt();
			System.out.println("请输入购买数量：");
			int number = sc.nextInt();
			switch(id){
				case 1:
					singleSum = number * 245.0f;
					System.out.println("T恤 ￥245.0\t 数量："+number+"\t 合计 ￥"+singleSum);
					break;
				case 2:
					singleSum = number * 570.0f;
					System.out.println("网球鞋 ￥570.0\t 数量："+number+"\t 合计 ￥"+singleSum);
					break;
				case 3:
					singleSum = number * 320.0f;
					System.out.println("网球拍 ￥320.0\t 数量："+number+"\t 合计 ￥"+singleSum);
					break;
			}
			sum += singleSum;
			System.out.println("是否继续购买（y/n）：");
			String YN = sc.next();
			char ifBuy = YN.charAt(0);			//获取字符串中的首个字符
			if(ifBuy == 'n')break;
			else if(ifBuy == 'y')continue;
			else	
				System.out.println("输入有误，请重新输入！");
		}
		
		System.out.println("\n 折扣：0.8");
		System.out.println("应付金额："+sum);
		System.out.println("实付金额："+(int)(sum * 0.8f));
		System.out.println("您输入的金额为：");
		int money = sc.nextInt();
		while(money < (int)(sum * 0.8f)){
			System.out.println("您输入的金额小于实付金额，请重新输入：");
			money = sc.nextInt();
		}
		System.out.println("找零：" + (money - (int)(sum * 0.8f)));	
	}
	
}