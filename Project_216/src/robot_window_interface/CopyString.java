package robot_window_interface;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CopyString {

	public static void main(String[] args) throws Exception {
		
		//Open Notepad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(4000);
		
		//Create object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		String path="C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		
		//Selecting String
		StringSelection spath=new StringSelection(path);
		
		//Get System Clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();

		//Set New Content to clipbaord
		clipboard.setContents(spath, null);
		
		
		//Press Control+V shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release control key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
	}

}
