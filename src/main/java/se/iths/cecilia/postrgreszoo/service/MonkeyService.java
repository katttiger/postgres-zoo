package se.iths.cecilia.postrgreszoo.service;

import org.springframework.stereotype.Service;
import se.iths.cecilia.postrgreszoo.exception.MonkeyNotFoundException;
import se.iths.cecilia.postrgreszoo.model.Monkey;
import se.iths.cecilia.postrgreszoo.repository.MonkeyRepository;

import java.util.List;

@Service
public class MonkeyService {

    private MonkeyRepository monkeyRepository;

    private MonkeyValidator monkeyValidator;

    public MonkeyService(MonkeyRepository monkeyRepository) {
        this.monkeyRepository = monkeyRepository;
    }

    public List<Monkey> getMonkeys(){
        return monkeyRepository.findAll();
    }

    public Monkey getMonkey(long id) {
        return monkeyRepository.findById(id)
                .orElseThrow(()-> new MonkeyNotFoundException("Monkey with id " + id + " not found"));
    }

    public Monkey createMonkey(Monkey monkey) {
        return monkeyRepository.save(monkey);
    }

    public Monkey updateMovie(long id, Monkey monkey) {
        monkey.setId(id);
        return monkeyRepository.save(monkey);
    }

    public void deleteMonkey(long id) {
        monkeyRepository.deleteById(id);
    }



}
