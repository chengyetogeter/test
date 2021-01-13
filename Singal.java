public class Singal{
	/*private static Singal s;
	private Singal(){}
	public static Singal getInstance(){
		if(s==null){
			Singal s=new Singal();//等价于s= new Singal;
		}
		return s;//懒汉式
	}*/
	private static Singal s=new Singal();
	private Singal(){}
	public static Singal getInstance(){
		return s;//饿汉式
	}
} 
