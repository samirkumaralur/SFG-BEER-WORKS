package guru.springframework.msscbrewery.web.model.V2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDtoV2 {

    private UUID uuid;
    private BeerStyleEnum beerStyleEnum;
    private String beerName;
    private long upc;
}
