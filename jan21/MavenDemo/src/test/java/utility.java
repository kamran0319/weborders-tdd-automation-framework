
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class utility {

        public static Object[][] readFromCSVFile(String filePath){

            List<List<String>> list = new ArrayList<>();
            try
                    ( BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {

                bufferedReader.readLine();
                list = bufferedReader.lines()
                        .map(s -> new ArrayList<>(Arrays.asList(s.split(","))))
                        .collect(Collectors.toList());
            }
            catch(IOException e){
                System.out.println("File doesn't exist");
            }

            Object[][] arr = new Object[list.size()][list.get(0).size()];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = list.get(i).get(j);
                }
            }

            return arr;

        }

        public static void main(String[] args) {
            Object[][] objects = readFromCSVFile("customers.csv");

            System.out.println(Arrays.deepToString(objects));
        }
    }


