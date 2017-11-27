package demo;

public class Demo1 {
	public static void main(String[] args) {
		/**
		 * 单例模式
		 * 模式：解决特定问题的固定套路
		 * 单例：在一个软件中，始终唯一的一个对象是单例
		 * 单例模式：解决单例问题的固定套路 
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