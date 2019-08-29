import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListSelectionDialog;


public class ShowDemoDialogHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ListSelectionDialog dialog = new ListSelectionDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), //
				new String[] {"Dogs", "Cats", "Mice", "Lice"}, new ArrayContentProvider(), new LabelProvider(), "Have a look");
		dialog.open();
		return null;
	}

}
