package com.pulses.pulse.config;



import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.*;
import com.google.firebase.database.*;
import com.pulses.pulse.model.Patient;


import java.io.IOException;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AppConfiguration {
    public AppConfiguration() throws IOException{
        //La idea es que cada vez que se vaya usar la base en cada clase se cree la conexión así
        //Supongo que lo hacen para no congestionarla
        FileInputStream serviceAccount = null;
        try {
            serviceAccount = new FileInputStream("pulseyourlife-a8037-firebase-adminsdk-r2x2a-a1f1f7e762.json");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AppConfiguration.class.getName()).log(Level.SEVERE, null, ex);
        }         
        if(serviceAccount != null){
            FirebaseOptions options = new FirebaseOptions.Builder()
               .setCredentials(GoogleCredentials.fromStream(serviceAccount))
               .setDatabaseUrl("https://pulseyourlife-a8037.firebaseio.com")
               .build();

            FirebaseApp.initializeApp(options);
            DatabaseReference ref = FirebaseDatabase
                    .getInstance()
                    .getReference();          
        }
    
    }
    
        
   
    

    

   
}
