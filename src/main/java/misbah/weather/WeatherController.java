package misbah.weather;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/weather")
public class WeatherController {

    @Autowired
    private RetreiveData retrieveData;
    ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping
    public ResponseEntity<Object> getCity(@RequestParam(required=true, defaultValue = "Bangalore") String city){
        return getwData(city);
    }
    public ResponseEntity<Object> getwData(String city){
        return new ResponseEntity<Object>(retrieveData.rwdata(city), HttpStatus.OK);

    }
}
