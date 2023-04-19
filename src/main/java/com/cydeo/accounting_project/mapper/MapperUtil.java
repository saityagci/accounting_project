package com.cydeo.accounting_project.mapper;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class MapperUtil {

    private final ModelMapper modelMapper;

    public MapperUtil(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }


    public <R> R convertToType(Object source, Class<R> resultClass) {
        return modelMapper.map(source, resultClass);
    }

}
