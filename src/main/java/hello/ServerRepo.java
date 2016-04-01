package hello;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by huimin on 4/1/16.
 */
public interface ServerRepo extends MongoRepository<Server, String> {
}
