package hello;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by huimin on 3/30/16.
 */
public interface ClientRepo extends MongoRepository<Client, String> {

    public Client findByObjectId(String objectId);
}
