package guru.springframework.msscbrewery.Service;

import guru.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveBeer(BeerDto beerDto);

    void updateBeer(UUID uuid, BeerDto beerDto);

    void deleteBeerById(UUID uuid);
}