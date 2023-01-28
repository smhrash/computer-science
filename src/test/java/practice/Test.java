package practice;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {

        List<String> zips = new ArrayList<String>();

//Valid ZIP codes
        zips.add("K1A 0B1");
        zips.add("B1Z 0B9");

//Invalid ZIP codes
        zips.add("K1A 0D1");
        zips.add("W1A 0B1");
        zips.add("Z1A 0B1");

        String regex = "(?!.*[DFIOQU])[A-VXY][0-9][A-Z] ?[0-9][A-Z][0-9]$";


        Pattern pattern = Pattern.compile(regex);

        //System.out.println(RandomStringUtils.randomAlphabetic());
        for (String zip : zips) {
            Matcher matcher = pattern.matcher(zip);
            System.out.println(matcher.matches());


        }
        if (isValidCanadianZipCode("K1A 0B1") == true) {
            System.out.println("This is valid zipcode");

        } else {
            System.out.println("This is invalid zipcode");
        }

    }

    public static boolean isValidCanadianZipCode(String zipCode) {

        String regex = "(?!.*[DFIOQU])[A-VXY][0-9][A-Z] ?[0-9][A-Z][0-9]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(zipCode);

        return matcher.matches();
    }


}
