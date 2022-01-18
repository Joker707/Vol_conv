import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("insert input type ('bls', 'gal' or 'l') or 'stop' to stop converter: ");
        String inputType = bufferedReader.readLine();
        while (true) {
            if (inputType.equals("stop")) {
                return;
            } else if (inputType.equals("bls") || inputType.equals("gal") | inputType.equals("l")) {
                break;
            } else {
                System.out.println("incorrect type, insert 'bls', 'gal', 'l' or 'stop' to stop converter: ");
                inputType = bufferedReader.readLine();
            }
        }
        Double value = null;
        do {
            System.out.println("insert your value: ");
            String number = bufferedReader.readLine();
            try {
                value = Double.parseDouble(number);
            } catch (NumberFormatException e) {
                System.out.println("That's not a number");
            }
        } while (value == null);
        System.out.println("insert output type ('bls', 'gal' or 'l'):");
        String outputType = bufferedReader.readLine();
        while (true) {
            if (outputType.equals("bls") || outputType.equals("gal") | outputType.equals("l")) {
                break;
            } else {
                System.out.println("incorrect type, insert 'bls', 'gal' or  'l' : ");
                outputType = bufferedReader.readLine();
            }
        }
        String fullType = inputType + " -> " + outputType;
        System.out.println(result(fullType, value));
    }

    static Double result(String fullType, Double value) {
        switch (fullType) {
            case "bls -> gal" :
                return value * 42;
            case "bls -> l" :
                return value * 158.97;
            case "gal -> bls" :
                return value * 0.024;
            case "gal -> l" :
                return value * 3.785;
            case "l -> bls" :
                return value * 0.0063;
            case "l -> gal" :
                return value * 0.264;
            default:
                return -1.0;
        }
    }
}