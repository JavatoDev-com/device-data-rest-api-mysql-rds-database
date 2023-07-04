package com.javatodev.app.mapper;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public abstract class DataMapper<E, D> {

    public abstract D convertToDto(E entity, Object... args);
    public abstract E convertToEntity(D dto, Object... args);

    public Collection<D> convertToDto(Collection<E> entity, Object... args) {
        return entity.stream().map(e -> convertToDto(e, args)).collect(Collectors.toList());
    }

    public List<D> convertToDtoList(Collection<E> entity, Object... args) {
        return convertToDto(entity, args).stream().collect(Collectors.toList());
    }


}
