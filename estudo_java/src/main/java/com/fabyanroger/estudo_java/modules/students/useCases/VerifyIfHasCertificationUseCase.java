package com.fabyanroger.estudo_java.modules.students.useCases;

import com.fabyanroger.estudo_java.modules.students.dto.VerifyHasCertificationDTO;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfHasCertificationUseCase {

    public boolean execute(VerifyHasCertificationDTO dto) {

        if(dto.getEmail().equals("fabyanroger@gmail.com") && dto.getTechnology().equals("JAVA")) {
            return true;
        } else {
            return false;
        }

    }

}
