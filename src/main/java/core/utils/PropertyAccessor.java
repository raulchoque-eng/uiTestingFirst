package core.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * PropertyAccessor class
 *
 * @author Raúl Choque
 * @version 0.0.1
 */
public class PropertyAccessor {

    private static PropertyAccessor PropertyAccessor;
    private Properties properties;

    private PropertyAccessor() {

        try (FileInputStream fileImputStream = new FileInputStream("wait.properties")) {
            properties = new Properties();
            properties.load(fileImputStream);
        } catch (FileNotFoundException fe) {

            throw new RuntimeException(fe);
        }
        catch (IOException e){
                throw new RuntimeException(e);
            }

    }

    public static PropertyAccessor getInstace() {
        if (PropertyAccessor == null) {
            PropertyAccessor = new PropertyAccessor();
        }
        return PropertyAccessor;
    }

    public int getImplicitWaitTime() {
        return Integer.parseInt(getDataProperty("implicitWaitTime"));
    }

    public int getExplicitWaitTime() {
        return Integer.parseInt(getDataProperty("explicitWaitTime"));
    }

    public int getWaitSleepTime() {
        return Integer.parseInt(getDataProperty("waitSleepTime"));
    }

    private String getDataProperty(String nameProperty) {
        String property = System.getProperty(nameProperty);
        if (property == null) {
            property = properties.getProperty(nameProperty);
        }
        return property;
    }
}
