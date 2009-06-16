package com.amalto.workbench.actions;

import java.util.ArrayList;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Event;
import org.eclipse.xsd.XSDComponent;
import org.eclipse.xsd.XSDSchema;

import com.amalto.workbench.dialogs.AnnotationOrderedListsDialog;
import com.amalto.workbench.editors.DataModelMainPage;
import com.amalto.workbench.providers.XSDTreeContentProvider;
import com.amalto.workbench.utils.ImageCache;
import com.amalto.workbench.utils.XSDAnnotationsStructure;

public class XSDSetAnnotationHiddenAction extends Action{

	protected DataModelMainPage page = null;
	protected XSDSchema schema = null;
	protected AnnotationOrderedListsDialog dlg = null;
	
	
	public XSDSetAnnotationHiddenAction(DataModelMainPage page) {
		super();
		this.page = page;
		setImageDescriptor(ImageCache.getImage( "icons/annotation.gif"));
		setText("Set the Hidden Accesses");
		setToolTipText("Set the Roles That Cannot See This Filed");
	}
	
	public void run() {
		try {
			super.run();
            schema = ((XSDTreeContentProvider)page.getTreeViewer().getContentProvider()).getXsdSchema();
            IStructuredSelection selection = (IStructuredSelection)page.getTreeViewer().getSelection();
            XSDAnnotationsStructure struc = new XSDAnnotationsStructure((XSDComponent)selection.getFirstElement());
            if (struc.getAnnotation() == null) {
            	throw new RuntimeException("Unable to edit an annotation for object of type "+selection.getFirstElement().getClass().getName());
            }
            
            dlg = new AnnotationOrderedListsDialog(
            		new ArrayList(struc.getHiddenAccesses().values()),
            		new SelectionListener() {
            			public void widgetDefaultSelected(SelectionEvent e) {}
            			public void widgetSelected(SelectionEvent e) {
            				dlg.close();
            			}
            		},
       				page.getSite().getShell(),
       				"Set The Roles That Cannot Access This Field",
       				"Roles",
       				page,
       				AnnotationOrderedListsDialog.AnnotationHidden_ActionType
       		);
            
       		dlg.setBlockOnOpen(true);
       		int ret = dlg.open();
       		if (ret == Window.CANCEL) return;

       		struc.setAccessRole(dlg.getXPaths(), dlg.getRecursive(),
					(IStructuredContentProvider) page.getTreeViewer()
					.getContentProvider(), "X_Hide");
       		
       		if (struc.hasChanged()) {
       			page.getTreeViewer().refresh(true);
       			page.getTreeViewer().expandToLevel(selection.getFirstElement(), 2);
       			page.markDirty();
       		}
       		
       
		} catch (Exception e) {
			e.printStackTrace();
			MessageDialog.openError(
					page.getSite().getShell(),
					"Error", 
					"An error occured trying to set the Hidden Access: "+e.getLocalizedMessage()
			);
		}		
	}
	public void runWithEvent(Event event) {
		super.runWithEvent(event);
	}
	


}