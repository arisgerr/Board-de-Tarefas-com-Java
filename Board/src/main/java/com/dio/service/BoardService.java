package com.dio.service;

import com.dio.persistence.entity.BoardEntity;
import com.dio.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public List<BoardEntity> findAll() {
        return boardRepository.findAll();
    }

    public Optional<BoardEntity> findById(Long id) {
        return boardRepository.findById(id);
    }

    public BoardEntity save(BoardEntity board) {
        return boardRepository.save(board);
    }

    public void deleteById(Long id) {
        boardRepository.deleteById(id);
    }

    public boolean existsById(Long id) {
        return boardRepository.existsById(id);
    }
}
