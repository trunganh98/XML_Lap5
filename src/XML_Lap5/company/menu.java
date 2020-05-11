import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

public class menu {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try{
            Object obj = parser.parse(new FileReader("src/Lab5_Json/menu.json"));
            JSONObject jsonObject = (JSONObject)obj;
            String id = (String) jsonObject.get("id");
            String value = (String) jsonObject.get("value");System.out.println("Menu");
            System.out.println("Id: " + id);
            System.out.println("Value: " + value);

            Map popup = ((Map)jsonObject.get("popup"));
            Iterator<Map.Entry> itr1 = popup.entrySet().iterator();
            while(itr1.hasNext()){
                Map.Entry pair = itr1.next();
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}