package com.pulses.pulse.controller;


import com.pulses.pulse.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
@CrossOrigin(origins = "http://localhost:8080")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> controllerGetRooms() throws pulseServicesException{
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(patientService.getPatients(),HttpStatus.ACCEPTED);
        } catch (pulseServicesException ex) {
            Logger.getLogger(pulseServicesException.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("There are no rooms: " + ex,HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(path = "/{email}", method = RequestMethod.GET)
    public ResponseEntity<?> controllerGetPatientByEmail(@PathVariable String email) throws pulseServicesException{
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(patientService.getPatientByEmail(email),HttpStatus.ACCEPTED);
        } catch (pulseServicesException ex) {
            Logger.getLogger(pulseServicesException.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("There are no players in this room: " + ex,HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> controllerChangeEmail(@RequestBody String newEmail, @RequestBody String email) throws pulseServicesException {
            try {
                patientService.changeEmail(newEmail, email);
            }
            catch(pulseServicesException ex){
                Logger.getLogger(pulseServicesException.class.getName()).log(Level.SEVERE, null, ex);
                return new ResponseEntity<>("Somenthing went wrong creating a new Room: POST METHOD ",HttpStatus.BAD_REQUEST);
            }
            return new ResponseEntity<>(HttpStatus.CREATED);
        }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> controllerChangeName(@RequestBody String newName, @RequestBody String email) throws pulseServicesException {
        try {
            patientService.changeName(newName, email);
        }
        catch(pulseServicesException ex){
            Logger.getLogger(pulseServicesException.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Somenthing went wrong creating a new Room: POST METHOD ",HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> controllerChangeWeight(@RequestBody String newWeight, @RequestBody String email) throws pulseServicesException {
        try {
            patientService.changeWeight(Integer.parseInt(newWeight), email);
        } catch (pulseServicesException ex) {
            Logger.getLogger(pulseServicesException.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Somenthing went wrong creating a new Room: POST METHOD ", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> controllerChangeHeight(@RequestBody String newheight, @RequestBody String email) throws pulseServicesException {
        try {
            patientService.changeWeight(Integer.parseInt(newHeight), email);
        } catch (pulseServicesException ex) {
            Logger.getLogger(pulseServicesException.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Somenthing went wrong creating a new Room: POST METHOD ", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}



