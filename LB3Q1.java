import java.util.Scanner;

class Bank
{
    private long accnum;

    public Bank(long accnum) 
	{
        this.accnum = accnum;
    }
	
	public long getAccnum()
	{
		return accnum;
	}
	
	public void setAccnum(long accnum)
	{
		this.accnum = accnum;
	}
	
}

class Customer extends Bank
{
	private String name;
	
	public Customer(long accnum,String name)
	{
		super(accnum);
		this.name = name;
	}
	
	public String getName() 
	{
        return name;
    }
	
	public void setName(String name)
	{
		this.name = name;
	}
	
}

class Deposit extends Bank
{
	private double payment;

	public Deposit(long accnum,double payment)
	{
		super(accnum);
		this.payment = payment;
	}
	
	public double getPayment() 
	{
        return payment;
    }
	
	public void setPayment(double payment)
	{
		this.payment = payment;
	}
    
}

class Main
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);

        System.out.print("Please put in customer name : ");
        String n = scanner.nextLine();
        System.out.print("Please put in account number : ");
        long a = scanner.nextLong();
        System.out.print("Please put in payment: RM");
        double p = scanner.nextDouble();
		
		Customer x = new Customer(a,n);
		Deposit y = new Deposit (a,p);
		
		System.out.println("---------------------------------");
		System.out.println("\t MAYBANK BERHAD");
		System.out.println("---------------------------------");
		
		System.out.println("Account number is : " + x.getAccnum());
		System.out.println("Customer name is : " + x.getName());
		System.out.println("Payment is : RM" + y.getPayment());
		System.out.println("---------------------------------");
       
	}
}