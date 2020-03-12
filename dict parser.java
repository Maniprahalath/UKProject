package Parser;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class StringParser {
    public static void main(String[] args) {
        String tempString = new String("{\"name\" : \"Ronaldo\",\"sport\" : \"soccer\",\"age\" : 25}");
        ObjectMapper mapper = new ObjectMapper();
        Map<String, String> map;
            try {
                map = mapper.readValue(tempString, Map.class);
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the number of inputs");
                int numberOfInput = scanner.nextInt();
                String[] inputArray = new String[numberOfInput];
                for(int i = 0; i< numberOfInput; i++)
                    inputArray[i] = scanner.next();
                for(String inputValue: inputArray) {
                    if (map.containsKey(inputValue)) {
                        System.out.println(map.get(inputValue));
                    } else {
                        System.out.println("Key is invalid"+ inputValue);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }