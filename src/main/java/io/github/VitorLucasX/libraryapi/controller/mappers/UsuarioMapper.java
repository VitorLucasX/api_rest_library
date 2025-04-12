package io.github.VitorLucasX.libraryapi.controller.mappers;

import io.github.VitorLucasX.libraryapi.controller.dto.UsuarioDTO;
import io.github.VitorLucasX.libraryapi.model.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    Usuario toEntity(UsuarioDTO dto);
}
