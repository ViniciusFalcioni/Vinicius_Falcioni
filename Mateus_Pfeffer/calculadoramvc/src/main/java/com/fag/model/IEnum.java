package com.fag.model;

public interface IEnum<T> {
    T getKey();
    T getValue();

    static <T, X extends IEnum<T>> X findByValue(Class<X> e, T value) {
        return findByValue(e, value, false);
    }

    static <T, X extends IEnum<T>> X findByValue(Class<X> e, T value, boolean ignoreCase) {
        if (value == null || !e.isEnum()) {
            return null;
        }

        X[] constants = e.getEnumConstants();

        for (X constant : constants) {
            if (matches(constant.getValue(), value, ignoreCase)
                    || matches(((Enum<?>) constant).name(), value, ignoreCase)) {
                return constant;
            }
        }

        return null;
    }

    private static <T> boolean matches(T enumValue, T valueToFind, boolean ignoreCase) {
        if (ignoreCase) {
            return enumValue.toString().equalsIgnoreCase(valueToFind.toString());
        }

        return enumValue.equals(valueToFind);
    }

}
