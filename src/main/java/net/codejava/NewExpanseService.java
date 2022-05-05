package net.codejava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class NewExpanseService {
    @Autowired
    private NewExpanseRepository repo;
        public List<NewExpanse> findAll(){
        return (List<NewExpanse>) repo.findAll();
    }


}
