package study.crazystone.me;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String string = null;
        try {
            while((string=(in.readLine()))!=null){
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
