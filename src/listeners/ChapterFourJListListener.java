package listeners;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ChapterFourJListListener {

public static void addListener(JList<String> list, JLabel label) {
	ListSelectionListener listSelectionListener = new ListSelectionListener() {
	      public void valueChanged(ListSelectionEvent listSelectionEvent) {
	        if (!listSelectionEvent.getValueIsAdjusting()) {
	        @SuppressWarnings("unchecked")
			JList<String> list = (JList<String>) listSelectionEvent.getSource();
	          Object selectionValue = list.getSelectedValue();
	          if(selectionValue.getClass().getName().equals("java.lang.String")) {
	        	  switch((String)selectionValue) {
	        	  	case "Hello": 
	        	  		label.setText("Hello");
	        	  		break;
	        	  	case "Is": 
	        	  		label.setText("Is");
	        	  		break;
	        	  	case "Time": 
	        	  		label.setText("Time");
	        	  		break;
	        	  }
	          }
	        }
	      }
	    };
	list.addListSelectionListener(listSelectionListener);
}
	
}
