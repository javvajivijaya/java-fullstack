package Lambda;
import java.util.ArrayList;
import java.util.Arrays;
public class OddLength {
	interface Stringlength{
		int getLength(String str);
		}





		public static void main(String[] args) throws CloneNotSupportedException
		{
		ArrayList<String> names = new ArrayList<>(Arrays.asList("Mouni","priya","Gaye","Rama","vijji"));





		names.removeIf((String str)-> str.length()%2 == 1 );





		System.out.println(names);
		}

}
