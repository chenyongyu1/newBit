package demo;

public class Demo1 {
	public static void main(String[] args) {
		/**
		 * ����ģʽ
		 * ģʽ������ض�����Ĺ̶���·
		 * ��������һ������У�ʼ��Ψһ��һ�������ǵ���
		 * ����ģʽ�������������Ĺ̶���· 
		 */
		/*Girl g1=new Girl();
		Girl g2=new Girl();*/
		Girl g1=Girl.getGirl();
		Girl g2=Girl.getGirl();
	}

}

class Girl{
	private static Girl girl=new Girl();
	public static Girl getGirl(){
		return girl;
	}
	private Girl(){
		
	}
	
}


class Boy{
	private static Boy boy;
	private Boy(){
		
	}
	public static Boy getBoy(){
		if(boy==null){
			boy=new Boy();
		}
		return boy;
	}
}