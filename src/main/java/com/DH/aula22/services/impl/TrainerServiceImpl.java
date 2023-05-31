package com.DH.aula22.services.impl;

import com.DH.aula22.model.Trainer;
import com.DH.aula22.services.TrainerService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService {
    @Override
    public List<Trainer> listTrainer() {
        return Arrays.asList(new Trainer("Lucas"), new Trainer("Marcos"));
    }
}
