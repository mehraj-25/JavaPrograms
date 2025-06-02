/*11)WAP to create the class name as Product with a following properties*/


import java.util.*;
class Product
{
	private int id;
	private String name;
	private int qty;
	private int rate;

	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void setQty(int qty)
	{
		this.qty=qty;
	}
	int getQty()
	{
		return qty;
	}
	void setRate(int rate)
	{	
		this.rate=rate;
	}
	int getRate()
	{
		return rate;
	}
}
class CalculateBill
{
	Product p[];
	void calBill(Product...p)
	{
		this.p=p;
		double totalBill=0;
		int cost=0;
		System.out.println("Display product data");
		System.out.println("P Id"+"\t"+"P Name"+"\t"+"P qty"+"\t"+"P Rate"+"\t"+"TotalBill");
		for(int i=0;i<p.length;i++)
		{
			 cost=p[i].getQty()*p[i].getRate();
			System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getQty()+"\t"+p[i].getRate()+"\t"+cost);
			totalBill+= p[i].getQty()*p[i].getRate();
		}
			 
		System.out.println("Total Bill is:"+totalBill);
	}
}
public class BillingApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		Product p1=new Product();
		p1.setId(1);
		p1.setName("xyz");
		p1.setQty(2);
		p1.setRate(20);

		Product p2=new Product();
		p2.setId(2);
		p2.setName("abc");
		p2.setQty(3);
		p2.setRate(10);

		Product p3=new Product();
		p3.setId(3);
		p3.setName("mno");
		p3.setQty(2);
		p3.setRate(5);
		CalculateBill cb=new CalculateBill();

		cb.calBill(p1,p2,p3);
		
	}

}