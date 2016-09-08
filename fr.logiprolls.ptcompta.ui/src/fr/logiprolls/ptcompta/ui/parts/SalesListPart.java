
package fr.logiprolls.ptcompta.ui.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class SalesListPart {

	@Inject
	public SalesListPart() {

	}

	@PostConstruct
	public void postConstruct(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		Label lblToto = new Label(parent, SWT.NONE);
		lblToto.setText("List");

		NatTable natTable = new NatTable(parent, SWT.BORDER | SWT.FULL_SELECTION);
		natTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
	}

	@Focus
	public void onFocus() {

	}

	@Persist
	public void save() {

	}


}