import java.util.HashMap;

public class HashingDemo 
{
	public static void main(String[] args) 
	{
		HashMap<String, String> mobiles=new HashMap<>();
		mobiles.put("m001", "iphone x");
		mobiles.put("m002", "iphone 11");
		mobiles.put("m003", "iphone 7");
		
		System.out.println(mobiles.get("m001"));
	}
}
