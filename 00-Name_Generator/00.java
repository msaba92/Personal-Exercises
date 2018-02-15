import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

class NameGenerator {

    public static void main(String[] args) throws IOException {
        URL firstnamesurl = new URL("https://raw.githubusercontent.com/dominictarr/random-name/master/first-names.txt");
        URL secondnamesurl = new URL("https://raw.githubusercontent.com/dominictarr/random-name/master/names.txt");
        BufferedReader s = new BufferedReader(new InputStreamReader(firstnamesurl.openStream()));
        BufferedReader r = new BufferedReader(new InputStreamReader(firstnamesurl.openStream()));

        ArrayList<String> firstlist = new ArrayList<String>();
        ArrayList<String> secondlist = new ArrayList<String>();
        String firstline;
        String secondline;

        while ((firstline = s.readLine()) != null) {
            firstlist.add(firstline);
        }
        s.close();

        while ((secondline = r.readLine()) != null) {
            secondlist.add(secondline);
        }
        r.close();

        Random random = new Random();

        String firstname = firstlist.get(random.nextInt(firstlist.size()));
        String lastname = secondlist.get(random.nextInt(secondlist.size()));
        System.out.printf(firstname + " " + lastname + "\n");
    }
}
