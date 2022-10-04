package guru.springframework.msscbrewery.Service.V2;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.V2.BeerDtoV2;
import guru.springframework.msscbrewery.web.model.V2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 saveBeer(BeerDtoV2 beerDtoV2) {
        return BeerDtoV2.builder()
                .uuid(beerDtoV2.getUuid())
                .beerName(beerDtoV2.getBeerName())
                .beerStyleEnum(beerDtoV2.getBeerStyleEnum())
                .upc(beerDtoV2.getUpc())
                .build();
    }

    @Override
    public void updateBeer(UUID uuid, BeerDtoV2 beerDtoV2) {
        //todo the update beer functionality
    }

    @Override
    public void deleteBeerById(UUID uuid) {
        log.debug("deletion of beer by id...");
    }

    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().uuid(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyleEnum(BeerStyleEnum.STYLE1)
                .build();
    }
}
