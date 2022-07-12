package Lambda2;
import java.util.function.Function;
public class function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,Integer> function=(t)->t.length();
	       System.out.println(function.apply("Hello word"));
	}

}
