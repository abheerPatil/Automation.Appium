import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class Methods {
	public boolean swipeToDirection_iOS_XCTest(MobileElement el, String direction, IOSDriver<MobileElement> driver) {
        try {
            JavascriptExecutor js = driver;
            HashMap<String, String> swipeObject = new HashMap<String, String>();
            if (direction.equals("d")) {
                swipeObject.put("direction", "down");
            } else if (direction.equals("u")) {
                swipeObject.put("direction", "up");
            } else if (direction.equals("l")) {
                swipeObject.put("direction", "left");
            } else if (direction.equals("r")) {
                swipeObject.put("direction", "right");
            }
            swipeObject.put("element", el.getId());
            js.executeScript("mobile:swipe", swipeObject);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
/*
    public boolean scrollToDirection_iOS_XCTest(MobileElement el, String direction, IOSDriver driver) {
        // The main difference from swipe call with the same argument is that scroll will try to move
        // the current viewport exactly to the next/previous page (the term "page" means the content,
        // which fits into a single device screen)
        try {
            JavascriptExecutor js = driver;
            HashMap<String, String> scrollObject = new HashMap<String, String>();
            if (direction.equals("d")) {
                scrollObject.put("direction", "down");
            } else if (direction.equals("u")) {
                scrollObject.put("direction", "up");
            } else if (direction.equals("l")) {
                scrollObject.put("direction", "left");
            } else if (direction.equals("r")) {
                scrollObject.put("direction", "right");
            }
            scrollObject.put("element", el.getId());
            scrollObject.put("toVisible", "true"); // optional but needed sometimes
            js.executeScript("mobile:scroll", scrollObject);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
*/
// Android scroll to some text in scroll View

//    public boolean tapByText(String text) {
//        List<AndroidElement> elementList = driver.findElements(MobileBy.AndroidUIAutomator(
//                "new UiScrollable(new UiSelector().resourceIdMatches(\".*id/ADD_YOUR_SCOLLER_VIEW_ID\")).setMaxSearchSwipes(5).scrollIntoView("
//                + "new UiSelector().text(\"" + text + "\"))"));
//        if (elementList.isEmpty())
//            return false;
//        return tapElement(elementList.get(0)); // tapElement is just custom tap method. use any you know instead.
//    }
}
