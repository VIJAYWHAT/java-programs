import java.util.Scanner;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import javax.sound.sampled.Clip;

class MessageBot{
/**
 * 
 * @param args
 * @throws AWTException
 * @throws InterruptedException
*
*/
    public static void main(String[] args) throws AWTException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Msg: ");
        String msg=scanner.nextLine();
        System.out.print("How many times to Send: ");
        int n = scanner.nextInt();
    
        StringSelection StringSelection = new StringSelection(msg);
        Clipboard Clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Clipboard.setContents(StringSelection, null);

        Thread.sleep(3000);

        Robot robot = new Robot();
        for (int i = 0; i < n; i++) {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(500);
        }

    }

}