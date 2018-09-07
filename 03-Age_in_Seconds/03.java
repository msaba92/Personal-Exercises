import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

class Temperature {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your date of birth (YYY/MM/DD): ");
        String birthstr = br.readLine();
        Date birth = sdf.parse(birthstr);
        long birth_l = birth.getTime();
        long now = System.currentTimeMillis();

        System.out.println("Seconds passed since birth: "+ ((now - birth_l) / 1000) +" seconds");
    }
}
