package eu.wisercat.test.configuration;

import eu.wisercat.test.model.CriteriaParameter;
import eu.wisercat.test.model.CriteriaType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "eu.wisercat.test.configuration.EnumConverterConfiguration.criteriaParameterConverter")
    Converter<String, CriteriaParameter> criteriaParameterConverter() {
        return new Converter<String, CriteriaParameter>() {
            @Override
            public CriteriaParameter convert(String source) {
                return CriteriaParameter.fromValue(source);
            }
        };
    }
    @Bean(name = "eu.wisercat.test.configuration.EnumConverterConfiguration.criteriaTypeConverter")
    Converter<String, CriteriaType> criteriaTypeConverter() {
        return new Converter<String, CriteriaType>() {
            @Override
            public CriteriaType convert(String source) {
                return CriteriaType.fromValue(source);
            }
        };
    }

}
