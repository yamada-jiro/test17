import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;

public class test18 {

	public static void main(String[] args) throws FindFailed {

		ImagePath.add("target/classes");
        Screen s = new Screen();
        s.click("WINDOWS.png");

	}

}
