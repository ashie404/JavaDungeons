package juniebyte.javadungeons.utils;

import com.google.common.base.Preconditions;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Reflect {
    public static Class getInnerClass(Class clazz, String name) {
        Class[] declaredClasses = clazz.getDeclaredClasses();
        for (Class c : declaredClasses) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    public static Object constructClass(Class clazz, Object... args) {
        Constructor<?>[] cap = clazz.getDeclaredConstructors();
        for (Constructor<?> c : cap) {
            Class<?>[] types = c.getParameterTypes();
            boolean match = true;
            for (int t = 0; t < types.length; t++) {
                Class<?> c_type = types[t];
                if (args[t] == null)
                    continue;
                if (isInstanceOf(c_type, args[t].getClass()))
                    continue;
                match = false;
                break;
            }
            if (match) {
                c.setAccessible(true);
                try {
                    return c.newInstance(args);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
	/*public static Object getMemberByType(Class field_class, Class object_class)
	{
		return getMemberByType(field_class, object_class, null);
	}*/

    public static Field getFieldByType(Class object_class, Class field_class) {
        Field[] fields = object_class.getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
            if (isInstanceOf(f.getType(), field_class))
                return f;
        }
        return null;
    }


    public static Object getMemberByType(Class object_class, Class field_class, Object object) {
        Field f = getFieldByType(object_class, field_class);
        try {
            if (f != null) {
                return f.get(object);
            }
        } catch (Exception ignored) {
        }
        return null;
		
		/*Field[] fields =object_class.getDeclaredFields();
		for(int i =0; i < fields.length; i++)
		{
			Field f = fields[i];
			f.setAccessible(true);
			if(f.getType().equals(field_class))
			{
				try
				{
					/*if (Modifier.isStatic(f.getModifiers()))
					{
						return f.get(null);
					}else*/
					/*{
						return f.get(object);
					}
				} catch (Exception e)
				{
				}
			}
		}
		return null;*/
    }


    public static Object[] getMemberArrayByType(Class type, Object object) {
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
            if (f.getType().isArray()) {
                Class ofArray = f.getType().getComponentType();
                if (isInstanceOf(ofArray, type)) {
                    try {
                        return (Object[]) f.get(object);
                    } catch (Exception ignored) {

                    }
                }
            }
        }
        return null;
    }

    public static boolean isInstanceOf(Class clazz, Class possibleInstance) {
        if (clazz.isAssignableFrom(possibleInstance))
            return true;
        if (clazz.isPrimitive()) {
            try {
                if (clazz.getField("TYPE").get(null).equals(possibleInstance))
                    return true;
            } catch (Exception ignored) {
            }
        }
        return false;
    }

    /**
     * Gets the value a field with the specified name in the given class.
     * Note: For performance, use {@link #findField(Class, String)} if you are getting the value more than once.
     * <p>
     * Throws an exception if the field is not found or the value of the field cannot be gotten.
     *
     * @param classToAccess The class to find the field on.
     * @param instance      The instance of the {@code classToAccess}.
     * @param fieldName     The SRG (unmapped) name of the field to find (e.g. "field_181725_a").
     * @param <T>           The type of the value.
     * @param <E>           The type of the {@code classToAccess}.
     * @return The value of the field with the specified name in the {@code classToAccess}.
     * @throws UnableToAccessFieldException If there was a problem getting the field.
     * @throws UnableToAccessFieldException If there was a problem getting the value.
     */
    public static <T, E> T getPrivateValue(Class<? super E> classToAccess, E instance, String fieldName)
    {
        try
        {
            return (T) findField(classToAccess, fieldName).get(instance);
        }
        catch (UnableToFindFieldException e)
        {
//            LOGGER.error(REFLECTION,"Unable to locate field {} ({}) on type {}", fieldName, remapName(INameMappingService.Domain.FIELD, fieldName), classToAccess.getName(), e);
            throw e;
        }
        catch (IllegalAccessException e)
        {
//            LOGGER.error(REFLECTION,"Unable to access field {} ({}) on type {}", fieldName, remapName(INameMappingService.Domain.FIELD, fieldName), classToAccess.getName(), e);
            throw new UnableToAccessFieldException(e);
        }
    }

    /**
     * Finds a field with the specified name in the given class and makes it accessible.
     * Note: For performance, store the returned value and avoid calling this repeatedly.
     * <p>
     * Throws an exception if the field is not found.
     *
     * @param clazz     The class to find the field on.
     * @param fieldName The SRG (unmapped) name of the field to find (e.g. "field_181725_a").
     * @param <T>       The type.
     * @return The constructor with the specified parameters in the given class.
     * @throws NullPointerException       If {@code clazz} is null.
     * @throws NullPointerException       If {@code fieldName} is null.
     * @throws IllegalArgumentException   If {@code fieldName} is empty.
     */
    public static <T> Field findField(final Class<? super T> clazz, final String fieldName)
    {
        Preconditions.checkNotNull(clazz, "Class to find field on cannot be null.");
        Preconditions.checkNotNull(fieldName, "Name of field to find cannot be null.");
        Preconditions.checkArgument(!fieldName.isEmpty(), "Name of field to find cannot be empty.");

        try
        {
            Field f = clazz.getDeclaredField(fieldName);
            f.setAccessible(true);
            return f;
        }
        catch (Exception e) {
            throw new UnableToFindFieldException(e);
        }
    }

    public static class UnableToAccessFieldException extends RuntimeException
    {
        private UnableToAccessFieldException(Exception e)
        {
            super(e);
        }
    }

    public static class UnableToFindFieldException extends RuntimeException
    {
        private UnableToFindFieldException(Exception e)
        {
            super(e);
        }
    }

    public static class UnableToFindMethodException extends RuntimeException
    {
        public UnableToFindMethodException(Throwable failed)
        {
            super(failed);
        }
    }

    public static class UnknownConstructorException extends RuntimeException
    {
        public UnknownConstructorException(final String message)
        {
            super(message);
        }
    }

}