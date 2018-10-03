package com.pulses.pulse.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.pulses.pulse.model.Patient;
import com.pulses.pulse.model.Relative;
import com.pulses.pulse.service.PatientService;
import com.pulses.pulse.service.PulseServicesException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/patient")
@CrossOrigin(origins = "http://localhost:8080")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> controllerGetPatients() {
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(patientService.getPatients(), HttpStatus.ACCEPTED);
        } catch (PulseServicesException ex) {
            Logger.getLogger(PulseServicesException.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("There are no patients: " + ex,HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(path = "/{email}", method = RequestMethod.GET)
    public ResponseEntity<?> controllerGetPatientByEmail(@PathVariable String email) {
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(patientService.getPatientByEmail(email),HttpStatus.ACCEPTED);
        } catch (PulseServicesException ex) {
            Logger.getLogger(PulseServicesException.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("There are no patients with this email: " + ex,HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(path = "/{email}/relative", method = RequestMethod.GET)
    public ResponseEntity<?> controllerGetRelativesByEmail(@PathVariable String email) {
        try {
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(patientService.getRelativesByEmail(email),HttpStatus.ACCEPTED);
        } catch (PulseServicesException ex) {
            Logger.getLogger(PulseServicesException.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("There are no relatives or patients with this email: " + ex,HttpStatus.NOT_FOUND);
        }
    }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> controllerNewPatient(@RequestBody String p) {
        try {
            //registrar dato
            ObjectMapper mapper = new ObjectMapper();
            Patient newPatient = mapper.readValue(p, Patient.class);
            patientService.newPatient(newPatient);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (IOException ex) {
            Logger.getLogger(PulseServicesException.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error in input",HttpStatus.FORBIDDEN);
        } catch (PulseServicesException ex) {
            Logger.getLogger(PulseServicesException.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Something went wrong in creation of the Patient",HttpStatus.FORBIDDEN);
        }
    }

    @RequestMapping(path = "/{email}",method = RequestMethod.POST)
    public ResponseEntity<?> controllerChangeEmail(@RequestBody String newEmail, @PathVariable String email) {
            try {
                patientService.changeEmail(newEmail, email);
            }
            catch(PulseServicesException ex){
                Logger.getLogger(PulseServicesException.class.getName()).log(Level.SEVERE, null, ex);
                return new ResponseEntity<>("Something went wrong changing the mail: POST METHOD ",HttpStatus.BAD_REQUEST);
            }
            return new ResponseEntity<>(HttpStatus.CREATED);
        }


    @RequestMapping(path = "/{email}/name",method = RequestMethod.POST)
    public ResponseEntity<?> controllerChangeName(@RequestBody String newName, @PathVariable String email) {
        try {
            patientService.changeName(newName, email);
        }
        catch(PulseServicesException ex){
            Logger.getLogger(PulseServicesException.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Something went wrong changing the name: POST METHOD ",HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(path = "/{email}/weight", = RequestMethod.POST)
    public ResponseEntity<?> controllerChangeWeight(@Requestbody String newWeight, @PathVariable String email) {
        try {
            patientService.changeWeight(Integer.parseInt(newWeight), email);
        } catch (PulseServicesException ex) {
            Logger.getLogger(PulseServicesException.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Something went wrong changing the weight: POST METHOD ", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(path = "/{email}/height",method = RequestMethod.POST)
    public ResponseEntity<?> controllerChangeHeight(@RequestBody String newHeight, @PathVariable String email) {
        try {
            patientService.changeHeight(Integer.parseInt(newHeight), email);
        } catch (PulseServicesException ex) {
            Logger.getLogger(PulseServicesException.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Something went wrong changing the height: POST METHOD ", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(path = "/{email}/relative",method = RequestMethod.POST)
    public ResponseEntity<?> controllerNewRelative(@RequestBody String r, @PathVariable String email) {
        try {
            //registrar dato
            ObjectMapper mapper = new ObjectMapper();
            Relative newRelative = mapper.readValue(r, Relative.class);
            patientService.addNewRelative(newRelative, email);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (IOException ex) {
            Logger.getLogger(PulseServicesException.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error in input",HttpStatus.FORBIDDEN);
        } catch (PulseServicesException ex) {
            Logger.getLogger(PulseServicesException.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Something went wrong in creation of the Relative",HttpStatus.FORBIDDEN);
        }
    }

}



