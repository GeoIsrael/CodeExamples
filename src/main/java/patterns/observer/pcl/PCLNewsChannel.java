package patterns.observer.pcl;

import lombok.Data;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

@Data
public class PCLNewsChannel implements PropertyChangeListener {

    private String news;

    public void propertyChange(PropertyChangeEvent evt) {
        this.setNews((String) evt.getNewValue());
    }
}