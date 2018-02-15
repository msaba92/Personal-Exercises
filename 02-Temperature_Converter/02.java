import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;

class Temperature {
    public static String convert(double temp, String unit) {

        double c = 0;
        double k = 0;
        double f = 0;

        DecimalFormat fr = new DecimalFormat("0.###");
        if (unit.equals("c")) {
            c = temp;
            f = 9.0 / 5.0 * c + 32;
            k = c + 237.15;
        } else if (unit.equals("f")) {
            f = temp;
            c = (f - 32) / 9.0 * 5.0;
            k = c + 237.15;
        } else if (unit.equals("k")) {
            k = temp;
            c = temp - 273.15;
            f = 9.0 / 5.0 * c + 32;
        }
        return String.format("K: %s\nC: %s\nF: %s\n", fr.format(k), fr.format(c), fr.format(f));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        String[] accepted = {"k", "f", "c"};
        System.out.print("Enter the unit of measure (k, c or f): ");
        String unit = br.readLine().toLowerCase();

        if (Arrays.asList(accepted).contains(unit)) {
            System.out.print("Enter the temperature you wish to convert: ");
            String tempstring = br.readLine();
            try {
                double temp = Double.parseDouble(tempstring);
                System.out.print(convert(temp, unit));
            } catch (NumberFormatException e) {
                System.out.println("Not a valid temperature number.");
            }
        } else {
            System.out.println("Not a valid unit.");
        }
    }
}
