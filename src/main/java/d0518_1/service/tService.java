package d0518_1.service;

import d0518_1.DTO.tDTO;
import d0518_1.repository.tRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class tService {
    @Autowired
    tRepository tr;
    public void save(String name,int age){
        tr.save(name,age);
    }
    public boolean save2(tDTO tdto){
        int result=tr.save2(tdto);
        boolean bool;
        if(result>0){
            bool=true;
        }else{
            bool=false;
        }
        return bool;
    }


}
