class Prime
{
	public static void main(String args[])
	{
		int num,i,temp=0;
		for(num=1;num<=1000;num++){
			for(i=2;i<=num-1;i++){
				if(num%i==0)
					temp=temp+1;
			}
			if(temp==0)
				System.out.println(num);
			else
				temp=0;
		}
	}
}