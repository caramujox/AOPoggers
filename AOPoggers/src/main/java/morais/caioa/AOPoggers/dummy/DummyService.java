package morais.caioa.AOPoggers.dummy;

import org.springframework.stereotype.Service;

@Service
public class DummyService {
    public void dummy(){
        System.out.println(
            "Hello from DummyService"
        );
    }
}
