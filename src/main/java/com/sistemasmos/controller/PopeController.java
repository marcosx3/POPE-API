package com.sistemasmos.controller;


import com.sistemasmos.model.Pope;
import com.sistemasmos.services.PopeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PopeController {
    @Autowired
    PopeServices popeServices;
    //select all popes
    @GetMapping("/popes")
    private List<Pope> getAllPopes(){
        return popeServices.getAllPopes();
    }
        // select pope by id
    @GetMapping("/popes/{id}")
    private Pope getPope(@PathVariable("id") int id){
        return popeServices.getPopeByID(id);
    }
    //delete pope by id
    @DeleteMapping("/pope/{id}")
    private void deletePope(@PathVariable("id")int id){
            popeServices.deletePope(id);
    }
    // save pope
    @PostMapping("/pope")
    private long savePope(@RequestBody Pope p){
        popeServices.updateOrSave(p);
        return p.getId();
    }
    //update
    @PutMapping("/pope/update")
    private Pope updatePope(@RequestBody Pope p){
        popeServices.updateOrSave(p);
        return p;
    }


}
