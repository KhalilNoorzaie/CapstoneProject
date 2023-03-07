package tek.sdet.framework.utilities;

public class DataGenerator {
	
	public static void main(String []args) {
		System.out.println(getData("name"));
		System.out.println(getData("email"));
		System.out.println(getData("random"));
		
	}
	public String getData(String input) {
		Faker faker = new Faker();
		String result = "";
		if(input.equals("name")) {
			result = ((String) faker.name()).trim();
			
		}else if (input.equals("email")) {
			result = faker.expression("#{letterify '????.????@tekschool.us'}");
			
		}else
			result = faker.expression("#{letterify '????.????@tekschool.us'}");
		return result;
	}

}
