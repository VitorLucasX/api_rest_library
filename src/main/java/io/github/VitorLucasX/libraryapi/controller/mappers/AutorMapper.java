package io.github.VitorLucasX.libraryapi.controller.mappers;

import io.github.VitorLucasX.libraryapi.controller.dto.AutorDTO;
import io.github.VitorLucasX.libraryapi.model.Autor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AutorMapper {

   // exemplo para mapear propriedades que não tem o mesmo nome
    @Mapping(source = "nacionalidade", target = "nacionalidade")

    Autor toEntity(AutorDTO dto);

    AutorDTO toDTO(Autor autor);
}
