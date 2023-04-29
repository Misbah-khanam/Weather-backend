package misbah.weather;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class RetreiveData {

    RestTemplate restTemplate = new RestTemplate();
    String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=";
    public Object rwdata( String city){
        System.out.println(restTemplate.getForObject(apiUrl+city+"&units=metric&APPID=96345cc1b16d4128389a1fe14cd27523", Object.class));
        Object data = restTemplate.getForObject(apiUrl+city+"&units=metric&APPID=96345cc1b16d4128389a1fe14cd27523", Object.class);
        return data;
    }


}