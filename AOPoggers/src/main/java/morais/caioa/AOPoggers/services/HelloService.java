package morais.caioa.AOPoggers.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public void hello(){
        System.out.println(
            "Hello from HelloService"
        );
    }
}
