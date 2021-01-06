package campuscheckin.campuscheckinapi;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingRepository extends MongoRepository<Booking,String>{
	List<Booking> findByuserIdEquals(String userId);
	List<Booking> findByroomIdEquals(String roomId);
}
