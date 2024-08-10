package com.example.use.service;

import com.example.use.entity.Standered;
import com.example.use.repository.StanderedRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StanderedService {

   private final StanderedRepository standeredRepository;

    public StanderedService(StanderedRepository standeredRepository) {
        this.standeredRepository = standeredRepository;
    }


    public List<Standered> getAllStandered() {
        return standeredRepository.findAll();
    }

    public Boolean addStandered(Standered standered) {
        try {
            Standered standered1=new Standered();

            standered1.setName(standered.getName());
            standered1.setNumberOfTeacher(standered.getNumberOfTeacher());
            standered1.setMonitorName(standered.getMonitorName());
            standered1.setNumberOfStudent(standered.getNumberOfStudent());
            standeredRepository.save(standered1);
            return true;
        } catch (Exception e) {
            return false;
        }

    }


    public Boolean editStandered(Standered standered) {
        Optional<Standered> stan = standeredRepository.findById(standered.getId());
        if (stan.isPresent()) {
        try {
            Standered standered1=new Standered();
            standered1.setId(standered.getId());
            standered1.setName(standered.getName());
            standered1.setNumberOfTeacher(standered.getNumberOfTeacher());
            standered1.setMonitorName(standered.getMonitorName());
            standered1.setNumberOfStudent(standered.getNumberOfStudent());
            standeredRepository.save(standered1);
            return true;
        } catch (Exception e) {
           return false;
        }}
        return false;





    }

    public Boolean deleteStandered(int id) {
        Optional<Standered> standered=standeredRepository.findById(id);
        if(standered.isPresent()){
            standeredRepository.deleteById(id);
            return true;
        }
        else{
            return false;
        }
    }
}
