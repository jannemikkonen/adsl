package fi.puv.e1401140.router;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WifiController {
	
	@Autowired
	private WifiRepository repository;

    @RequestMapping(value = "/wifi" , method = RequestMethod.POST)
    public @ResponseBody Wifi addWifi(@RequestBody Wifi jsonWifi) {
    	repository.save(jsonWifi);
        return jsonWifi;
    }  	
    
    @RequestMapping(value = "/wifi" , method = RequestMethod.DELETE)
    public void deleteWifi(@RequestBody Wifi jsonWifi) {
    	repository.delete(jsonWifi);
        
    }  	
    
    @RequestMapping(value = "/wifi" , method = RequestMethod.PUT)
    public @ResponseBody Wifi UpdateWifi (@RequestBody Wifi jsonWifi) {
    	repository.delete(jsonWifi);
        return jsonWifi;
    }  
    
    @RequestMapping(value = "/wifi" , method = RequestMethod.GET)
    public Wifi get(@RequestParam (value="id", defaultValue="1") int id) {
    	return repository.findOne(id);
    }
    
    @RequestMapping("/test")
    public String test(@RequestParam(value="name", defaultValue="World") String name) {
        return "{\"id\":\"hello\"}";
    }	
	
}
