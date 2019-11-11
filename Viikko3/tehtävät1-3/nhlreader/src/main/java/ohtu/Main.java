package ohtu;

import com.google.gson.Gson;  
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.http.client.fluent.Request; 

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://nhlstatisticsforohtu.herokuapp.com/players";
        
        String bodyText = Request.Get(url).execute().returnContent().asString();
                 
        System.out.println("json-muotoinen data:");
        System.out.println( bodyText );

        Gson mapper = new Gson();
        Player[] players = mapper.fromJson(bodyText, Player[].class);
        
        System.out.println("Oliot:");
        for (Player player : players) {
            
            //System.out.println(player);
        }
        List<Player> suomiLista = new ArrayList();
        for (Player player : players) {
            if (player.getNationality().equals("FIN")){
            suomiLista.add(player);
            }
        }
        Collections.sort(suomiLista);
        for (Player p:suomiLista){
            System.out.println(p);
        }
        
    }
  
}
