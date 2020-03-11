package ru.ais.courses.arch.archpractice.config;

import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import ru.ais.courses.arch.archpractice.dao.CatRepository;
import ru.ais.courses.arch.archpractice.model.Cat;

@Component
@RequiredArgsConstructor
public class Initer implements ApplicationRunner {

  CatRepository catRepository;

  @Override
  public void run(ApplicationArguments args) throws Exception {
    Stream.of("Васька", "Мурка", "Мурзик")
        .map(Cat::new)
        .forEach(catRepository::save);
  }
}
