package ru.itservice.testTask.component.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.springframework.stereotype.Component;
import ru.itservice.testTask.common.exception.ValueToMapException;

import java.util.Collection;

import static ru.itservice.testTask.common.exception.ValueToMapException.baseMessage;

/**
 * Компонент для конвертации результатов выполнения задач в строку и обратно
 */
@Component
public class ResultConverter {

    private final ObjectMapper mapper;
    private TypeFactory typeFactory;

    public ResultConverter(ObjectMapper mapper) {
        this.mapper = mapper;
        this.typeFactory = mapper.getTypeFactory();
    }

    /**
     * Метод конвертирует результат вычисления задачи в строку в формате JSON
     *
     * @param value результат вычисления задчи
     * @return строка для записи в БД
     */
    public String convertValueToString(Object value) {
        try {
            return mapper.writeValueAsString(value);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new ValueToMapException(baseMessage + " " + value);
        }
    }

    /**
     * Метод конвертирует строку в коллекцию значений
     *
     * @param value строка в формате JSON
     * @return
     */
    public Collection<String> convertStringToCollection(String value) {
        try {
            return mapper.readValue(value, typeFactory.constructCollectionType(Collection.class, String.class));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new ValueToMapException(baseMessage + " " + value);
        }
    }

}
