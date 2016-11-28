package net.nickpalenchar;

/**
 * Created by nick on 11/24/16.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure, float heatIndex);
}
