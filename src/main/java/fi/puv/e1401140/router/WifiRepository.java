package fi.puv.e1401140.router;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
	
	public interface WifiRepository extends CrudRepository<Wifi, Integer>{
		List<Wifi> findById(int id);	//create read update delete
	}


	
