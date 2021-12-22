package com.sistemasmos.services;

import com.sistemasmos.model.Pope;
import com.sistemasmos.repository.PopeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PopeServices {

    @Autowired
    PopeRepository popeRepository;

        // get all popes
    public List<Pope> getAllPopes(){
        List<Pope> popesList = new ArrayList<Pope>();
        popesList.addAll(popeRepository.findAll());
        return  popesList;
    }
    // get specif pope by id
    public Pope getPopeByID(int id){
        return popeRepository.getById(id);
    }


    //save specific pope
    public void updateOrSave(Pope p ){
        popeRepository.save(p);
    }
    //update a pope
    public void update(Pope p, int id) {
        popeRepository.save(p);
    }


    //delete pope by id
    public void deletePope(int id){
        popeRepository.deleteById(id);
    }

}
