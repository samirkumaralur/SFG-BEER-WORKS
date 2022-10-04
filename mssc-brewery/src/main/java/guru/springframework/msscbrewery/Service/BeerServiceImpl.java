package guru.springframework.msscbrewery.Service;

import guru.springframework.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(beerDto.getId())
                .beerName(beerDto.getBeerName())
                .beerStyle(beerDto.getBeerStyle())
                .upc(beerDto.getUpc())
                .build();
    }

    @Override
    public void updateBeer(UUID uuid, BeerDto beerDto) {
        //todo the update beer functionality
    }

    @Override
    public void deleteBeerById(UUID uuid) {
      log.debug("deletion of beer by id...");
    }

    @Override
    public BeerDto getBeerById(UUID beerId) {
         return BeerDto.builder().id(UUID.randomUUID())
                 .beerName("Galaxy Cat")
                 .beerStyle("Pale Ale")
                 .build();
    }
}
