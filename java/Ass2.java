class Ass2
{public static void main(String args[])
	{int stock=600;
	int price,commission,total;
	System.out.println("Total bought share is"+stock);
	price=stock*20;
	System.out.println("Total price is bought of share:"+price);
	commission=(price/100)*2;
	System.out.println("Total commission is : "+commission);
	total=price+commission;
	System.out.println("Toatl ammount paid : "+total);
	}
}