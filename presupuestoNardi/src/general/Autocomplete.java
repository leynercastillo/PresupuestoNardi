package general;

import java.util.List;

import org.zkoss.zul.Combobox;
import org.zkoss.zul.Comboitem;

public class Autocomplete {

    private int maxItems;

    public Autocomplete(int maxItems) {
	this.maxItems = maxItems;
    }

    public int getMaxItems() {
	return maxItems;
    }

    public void setMaxItems(int maxItems) {
	this.maxItems = maxItems;
    }

    public Combobox getAutoCompleted(Combobox combobox, String compare) {
	List<Comboitem> listItems = combobox.getItems();
	combobox.getItems().clear();
	int x = 0;
	int listSize = listItems.size();
	while (x < listSize) {
	    String str = listItems.get(x).getLabel().toLowerCase();
	    if (compare.toLowerCase().indexOf(str) != -1) {
		combobox.getItems().add(new Comboitem(str));
	    }
	    x++;
	}
	return combobox;
    }
}