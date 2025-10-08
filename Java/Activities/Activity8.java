public class Activity8 {

public static void exceptionTest(String value) throws CustomException {
        if (value == null) {
            throw new CustomException("Custom Error: The string value is null!");
        } else {
            System.out.println("String value: " + value);
        }
    }

public static void main(String[] args) {
	try {
		exceptionTest("Hello, World!");
		exceptionTest(null);
	} catch (CustomException e) {
        // Catch block prints custom error message
        System.out.println("Caught Exception: " + e.getMessage());
	}

	}

}