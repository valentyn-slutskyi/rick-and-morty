package rickandmorty.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rickandmorty.dto.CharacterResponseDto;
import rickandmorty.dto.mapper.MovieCharacterMapper;
import rickandmorty.model.MovieCharacter;
import rickandmorty.service.MovieCharacterService;

@RestController
@RequestMapping("/movie-characters")
public class MovieCharacterController {
    private final MovieCharacterService movieCharacterService;
    private final MovieCharacterMapper mapper;

    public MovieCharacterController(MovieCharacterService movieCharacterService,
                                    MovieCharacterMapper mapper) {
        this.movieCharacterService = movieCharacterService;
        this.mapper = mapper;
    }

    @GetMapping("/random")
    @ApiOperation(value = "Get random character")
    public Object getRandom() {
        MovieCharacter character = movieCharacterService.getRandomCharacter();
        return mapper.toResponseDto(character);
    }

    @ApiOperation(value = "Get all characters by name")
    @GetMapping("/by-name")
    public List<CharacterResponseDto> findAllByName(@RequestParam("name")
                                                @ApiParam(value = "name pattern") String namePart) {
        return movieCharacterService.findAllByNameContains(namePart)
                .stream()
                .map(mapper::toResponseDto)
                .collect(Collectors.toList());
    }
}
