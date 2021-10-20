package utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Utils {

    public static String getBaseUrl(){
        return "http://automationpractice.com/";
    }

    public static String generateRandomPart() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String randomName = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return randomName;
    }

    public static Map<String, String> testData = new HashMap<String, String>();
    static {
        testData.put("firstName", "Matheuzito");
        testData.put("lastName", "Junior");
        testData.put("email", "@testecwi.com");
        testData.put("password", "cwireset");
        testData.put("dayDateOfBirth", "27");
        testData.put("monthDateOfBirth", "2");
        testData.put("yearDateOfBirth", "1992");
        testData.put("company", "CWI #quemsabe");
        testData.put("addressLine1", "Rua dos sonhos");
        testData.put("addressLine2", "Numero 57, esquina com a Padaria");
        testData.put("city", "São Leopoldo");
        testData.put("state", "Alaska");
        testData.put("zipCode", "12345");
        testData.put("country", "United States");
        testData.put("additionalInformation","The cake is a lie.");
        testData.put("homePhone", "5551123456789");
        testData.put("mobilePhone", "5551234567890");
        testData.put("alias", "Minha casa Minha vida");
    }

    public static void waitForManualCheckup(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
