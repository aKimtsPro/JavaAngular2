package demo.pattern;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ServiceLocator {
    //region singleton
    private static ServiceLocator _instance = null;
    public static ServiceLocator instance() {
        if (_instance == null) {
            _instance = new ServiceLocator();
        }
        return _instance;
    }
    //endregion

    private Map<Class<?>, Object> services = new HashMap<>();

    private ServiceLocator(){

    }

    public <T> ServiceLocator add(Class<?> clazz, Class<T> target) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        this.services.put(clazz, target.getConstructor().newInstance());
        return this;
    }
    public <T> T get(Class<?> clazz) {
        return (T) this.services.get(clazz);
    }

}
