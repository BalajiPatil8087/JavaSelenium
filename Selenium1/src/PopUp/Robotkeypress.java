package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Robotkeypress 
{
	public static void main(String[] args) throws AWTException 
	{
		Robot rt=new Robot();
		//rt.keyPress(KeyEvent.VK_CONTEXT_MENU);
		//rt.keyRelease(KeyEvent.VK_CONTEXT_MENU);//perform Right click
		
		rt.keyPress(KeyEvent.VK_WINDOWS);
		rt.keyPress(KeyEvent.VK_D);
		
		rt.keyRelease(KeyEvent.VK_WINDOWS);     // for window  minimize
		rt.keyRelease(KeyEvent.VK_D);      
	}

}
