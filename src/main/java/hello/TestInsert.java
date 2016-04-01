//package hello;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//import org.springframework.data.rest.core.mapping.ResourceType;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by huimin on 3/30/16.
// */
//@SpringBootApplication
//@EnableMongoRepositories
//public class TestInsert implements CommandLineRunner{
//
//    @Autowired
//    ClientRepo clientRepo;
//
//    public static void main(String[] args) {
//        SpringApplication.run(TestInsert.class, args);
//    }
//
//
//
//
//    public void run(String... args) throws Exception {
////        Client newClient = new Client();
////        List<ResourceInfo> resource = new ArrayList<>();
////        newClient.setObjectId("3");
////        newClient.setObjectInstanceId("0");
////        newClient.setObjectName("Device");
////        newClient.setResources(resource);
////
////
////        ResourceInfo resource0 = new ResourceInfo();
////        resource0.setResourceId("0");
////        resource0.setResourceName("Manufacturer");
////        resource0.setValue("Samaung");
////        resource.add(resource0);
////
////        ResourceInfo resource1 = new ResourceInfo();
////        resource1.setResourceId("1");
////        resource1.setResourceName("Model Number");
////        resource1.setValue("French Door Refrigerator Refrigerator 1.0");
////        resource.add(resource1);
////
////        ResourceInfo resource2 = new ResourceInfo();
////        resource2.setResourceId("2");
////        resource2.setResourceName("Serial Number");
////        resource2.setValue("RF260BEAESR");
////        resource.add(resource2);
////
////        clientRepo.save(newClient);
////
////        for (Client c : clientRepo.findAll()) {
////            System.out.println(c.toString());
////        }
//
//        Client client = clientRepo.findByObjectId("4");
//        //client.getObjectName();
//        System.out.println(client.getObjectName());
//        client.setObjectName("uuuuuuuu");
//        clientRepo.save(client);
//
//        System.out.println(clientRepo.findByObjectId("4").getObjectName());
//
//
//
//    }
//}
