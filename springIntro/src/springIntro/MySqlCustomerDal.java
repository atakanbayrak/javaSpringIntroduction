package springIntro;

public class MySqlCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("MySQL Veri Taban�na Eklendi");
		
	}

}
