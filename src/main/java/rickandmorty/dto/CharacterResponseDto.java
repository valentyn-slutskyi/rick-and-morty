package rickandmorty.dto;

import lombok.Data;
import rickandmorty.model.Gender;
import rickandmorty.model.Status;

@Data
public class CharacterResponseDto {
    private Long id;
    private Long externalId;
    private String name;
    private Status status;
    private Gender gender;
}
