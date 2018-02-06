import java.io.*;
import java.net.*;
import java.util.*;

class name_generator {

    public static void main(String[] args) throws IOException {
        URL first_names_url = new URL("https://raw.githubusercontent.com/dominictarr/random-name/master/first-names.txt");
        URL second_names_url = new URL("https://raw.githubusercontent.com/dominictarr/random-name/master/names.txt");
        BufferedReader s = new BufferedReader(new InputStreamReader(first_names_url.openStream()));
        BufferedReader r = new BufferedReader(new InputStreamReader(first_names_url.openStream()));

        List<String> firstlist = new ArrayList<String>();
        List<String> secondlist = new ArrayList<String>();
        String firstline;
        String secondline;

        while((firstline = s.readLine()) != null){
            firstlist.add(firstline);
        }
            s.close();

        while((secondline = r.readLine()) != null){
            secondlist.add(secondline);
        }
        r.close();

        Random random = new Random ();

        String firstname = firstlist.get(random.nextInt(firstlist.size()));
        String lastname = secondlist.get(random.nextInt(secondlist.size()));
        System.out.printf(firstname + " " + lastname + "\n");
    }
}
