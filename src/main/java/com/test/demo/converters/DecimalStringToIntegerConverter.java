package com.test.demo.converters;

import org.springframework.core.convert.converter.Converter;

public class DecimalStringToIntegerConverter implements Converter<String, Integer> {
    @Override
    public Integer convert(String source) {
        try {
            if (source.length() > 2) throw new Exception("log this error");
            return new Double(source).intValue();
        } catch (Exception ex) {
            return 0;
        }
    }
}
