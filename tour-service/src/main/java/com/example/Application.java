package com.example;

import com.example.tourservice.TourManagementService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.example.tourservice.SpringBeans;
import com.example.tourservice.TravelAgentService;

public class Application {

    public static void main(String[] args) {
        //Instantiating ApplicationContext, this is where we will have our configuration of our dependency injection
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class.getPackageName());
        //from the context, I say getBean and I want the TravelAgentService class, it will have within the springboot container that object
        TravelAgentService agent = context.getBean(TravelAgentService.class);
        TourManagementService manager = context.getBean(TourManagementService.class);
        manager.createTour("Zoo Tour", 100, true);
        System.out.println("\n******Explore California Tour Catalogue******");
        agent.displayTours();

        System.out.println("\n******Explore California Tour Kid Friendly Tours******");
        agent.displayToursBy(true);
    }
}