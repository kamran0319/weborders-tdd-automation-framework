package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CSVReader {


    public static Object[][] readFromCSVFile(String filePath){

        List<List<String>> list = new ArrayList<>();
        try {
            list = Files.lines(Path.of(filePath))
                    .map(s -> new ArrayList<>(Arrays.asList(s.split(","))))
                    .collect(Collectors.toList());
        } catch(IOException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        Object[][] arr = new Object[list.size()][list.get(0).size()];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = list.get(i).get(j);
            }
        }

        return arr;


    }



}
