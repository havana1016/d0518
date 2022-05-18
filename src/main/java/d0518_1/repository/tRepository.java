package d0518_1.repository;

import d0518_1.DTO.tDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class tRepository {
    @Autowired
    SqlSessionTemplate sql;



    public void save(String name, int age){
        //sql.insert("test.save",name);
        tDTO dt =new tDTO(name,age);
        sql.insert("test.save1",dt);
    }

    public int save2(tDTO tdto){
        //sql.insert("test.save",name);
        return sql.insert("test.save1",tdto);
    }
}
