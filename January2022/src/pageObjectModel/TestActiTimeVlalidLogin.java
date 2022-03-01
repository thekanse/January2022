package pageObjectModel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class TestActiTimeVlalidLogin extends BaseTest1 implements IAutoConst
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		BaseTest1 bt = new BaseTest1();
		bt.openBrowser();
		LoginPage lp = new LoginPage(driver);
		
		Flib flib = new Flib();
		String validUsername = flib.readProperty(PROP_PATH, "un");
		String validPasseword = flib.readProperty(PROP_PATH, "pwd");
		lp.validLogin(validUsername, validPasseword);
		bt.closeBrowser();
	}

}
