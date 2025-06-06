package com.dio.service;

import com.dio.persistence.entity.CardEntity;
import com.dio.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    public List<CardEntity> findAll() {
        return cardRepository.findAll();
    }

    public Optional<CardEntity> findById(Long id) {
        return cardRepository.findById(id);
    }

    public CardEntity save(CardEntity card) {
        return cardRepository.save(card);
    }

    public void deleteById(Long id) {
        cardRepository.deleteById(id);
    }

    public boolean existsById(Long id) {
        return cardRepository.existsById(id);
    }
}
