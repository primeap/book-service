package org.ap.books;

import org.slf4j.Logger;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Component
@Scope(value = "prototype")
public class StartupTask {
 
    private static final Logger LOGGER=LoggerFactory.getLogger(StartupTask.class);
    private static int INDEX=0;
    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        LOGGER.info ("hello world, I have just started up");
        long st =  System.currentTimeMillis();
        long end = -1;
        do{

            while( st+10000 > end ) {end = System.currentTimeMillis();}

            st =  System.currentTimeMillis();
            INDEX++;
            LOGGER.info ("Reached Index {}",INDEX);
        }while(INDEX<=30);
    }
}