package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import stepdefinition.SharedSD;

import java.io.*;
import java.util.List;
import java.util.HashMap;

import java.util.Map;


public class BasePage {


	//I.General scripting / logic:Question No1==========================================


	public void reverseEverything(String s) {


		String givenString = s;

		//String class does not have reverse() method. So need to convert the input string to StringBuilder

		StringBuilder givenString1 = new StringBuilder();

		// append a givenString into StringBuilder givenString1
		givenString1.append(givenString);

		// reverse StringBuilder givenString1
		givenString1 = givenString1.reverse();

		// print reversed givenString
		for (int i = 0; i < givenString1.length(); i++) {
			System.out.print(givenString1.charAt(i));
		}
	}

	//I.General scripting / logic:Question No2==========================================

	public void displayAllElement(By locator) {
		List<WebElement> elementList = SharedSD.getDriver().findElements(locator);

		HashMap<String, String> map = new HashMap<String, String>();

		for (int i = 0; i < elementList.size(); i++) {


			if (i == 1 || i == 3 || i == 5 || i == 7) {
				continue;

			} else {
				map.put(elementList.get(i).getText(), elementList.get(i + 1).getText());
			}

		}

		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}
	}


	//I.General scripting / logic:Question No3a==========================================

		public void doesFileExist(String filePath){

			File myFile = new File(filePath);
			try {
				FileReader myReader = new FileReader(myFile);
			} catch (FileNotFoundException e) {
				System.out.println("Invalid directory");
				e.printStackTrace();
			}
	}

	//I.General scripting / logic:Question No3b==========================================

			public void readFileAndDisplay(String fileLocation) throws IOException {

				BufferedReader in = new BufferedReader(new FileReader(fileLocation));
				String line;
				while((line = in.readLine()) != null)
				{
					System.out.println(line);
				}
				in.close();

		}

	}






