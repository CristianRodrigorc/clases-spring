package com.jdk21.academia.features.curso.mapper;

import com.jdk21.academia.domain.Curso;
import com.jdk21.academia.features.curso.dto.CursoDto;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-06T17:07:52+0100",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.44.0.v20251023-0518, environment: Java 21.0.8 (Eclipse Adoptium)"
)
public class CursoMapperImpl implements CursoMapper {

    @Override
    public CursoDto toDto(Curso curso) {
        if ( curso == null ) {
            return null;
        }

        CursoDto.CursoDtoBuilder cursoDto = CursoDto.builder();

        cursoDto.descripcion( curso.getDescripcion() );
        cursoDto.duracionHoras( curso.getDuracionHoras() );
        cursoDto.idCurso( curso.getIdCurso() );
        cursoDto.idFormato( curso.getIdFormato() );
        cursoDto.idMateria( curso.getIdMateria() );
        cursoDto.nombre( curso.getNombre() );

        return cursoDto.build();
    }

    @Override
    public Curso toEntity(CursoDto cursoDto) {
        if ( cursoDto == null ) {
            return null;
        }

        Curso.CursoBuilder curso = Curso.builder();

        curso.descripcion( cursoDto.getDescripcion() );
        curso.duracionHoras( cursoDto.getDuracionHoras() );
        curso.idCurso( cursoDto.getIdCurso() );
        curso.idFormato( cursoDto.getIdFormato() );
        curso.idMateria( cursoDto.getIdMateria() );
        curso.nombre( cursoDto.getNombre() );

        return curso.build();
    }
}
