package feature;

import java.util.HashMap;
import java.util.Map;

public class FeatureService {

    private static final Map<FunctionKey, Available> FUNCTIONS = new HashMap<>();
    static {
        FUNCTIONS.put(FunctionKey.EDIT, new EditAvailable());
    }

    public boolean available(FunctionKey key) {
        return FUNCTIONS.getOrDefault(key, () -> false).check();
    }
}
