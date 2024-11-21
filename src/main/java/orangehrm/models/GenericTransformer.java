package orangehrm.models;

import java.lang.reflect.Field;
import java.util.Map;

public class GenericTransformer {


    public <T> T transform(Map<String, String> row, Class<T> clazz) {
        try {
            T instance = clazz.getDeclaredConstructor().newInstance();

            for (Map.Entry<String, String> entry : row.entrySet()) {
                Field field = clazz.getDeclaredField(entry.getKey());
                field.setAccessible(true); // Permitir acceso a campos privados
                field.set(instance, entry.getValue());
            }
            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Error al transformar el DataTable a " + clazz.getSimpleName(), e);
        }
    }
}
