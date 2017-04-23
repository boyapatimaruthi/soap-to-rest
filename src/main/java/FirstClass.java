
public class FirstClass {

		public static void main(String...args) {
			
			FirstClass fC = new FirstClass();
			System.out.println(fC.getMessage("Maruthi"));
		}

		public String getMessage(String string) {
			// TODO Auto-generated method stub
			return "Hello "+ string.toUpperCase();
		}
}
