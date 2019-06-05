package GUI;
import Model.*;
import Organism.*;
import org.eclipse.swt.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.graphics.*;
import org.eclipse.swt.widgets.*;

public class GUI { 	

	public static Shell ConfigureShell(Display display) {
		Model model = new Model();
			
		Shell shell = new Shell(display, SWT.SHELL_TRIM&(~SWT.RESIZE) );
		shell.setText("Laba3_var4");
		shell.setSize(500, 300);
		shell.setLayout(new GridLayout(1, true));	
		
		GridData gridData = new GridData();
		gridData.horizontalAlignment = gridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		
		Label resultNoseSniff= new Label(shell, SWT.PUSH);
		resultNoseSniff.setText("Now it smells: ");
		resultNoseSniff.setFont(new Font(display,"Calibri", 12, SWT.NULL));
		resultNoseSniff.setLayoutData(gridData);
		
		Label resultNoseScratch= new Label(shell, SWT.PUSH);
		resultNoseScratch.setText("Now you feel: ");
		resultNoseScratch.setFont(new Font(display,"Calibri", 12, SWT.NULL));
		resultNoseScratch.setLayoutData(gridData);
		
		Label resultMouthEat= new Label(shell, SWT.PUSH);
		resultMouthEat.setText("Now you eat: ");
		resultMouthEat.setFont(new Font(display,"Calibri", 12, SWT.NULL));
		resultMouthEat.setLayoutData(gridData);
		
		Label resultMouthSay= new Label(shell, SWT.PUSH);
		resultMouthSay.setText("Now you are talking: ");
		resultMouthSay.setFont(new Font(display,"Calibri", 12, SWT.NULL));
		resultMouthSay.setLayoutData(gridData);
		
		Label resultEar= new Label(shell, SWT.PUSH);
		resultEar.setText("Now you listen: ");
		resultEar.setFont(new Font(display,"Calibri", 12, SWT.NULL));
		resultEar.setLayoutData(gridData);
		
		Button control = new Button(shell, SWT.PUSH);
		control.setText("Control");
		control.setFont(new Font(display,"Calibri", 12, SWT.NULL));
		control.setLayoutData(gridData);
		
		control.addListener(SWT.Selection, new Listener(){	
			public void handleEvent(Event event) {
				model.brain.governOrgans(model.mouth, model.nose, model.stomach);
				model.ear.feel(model.brain);
				resultNoseSniff.setText("Now it smells: "+model.brain.getDataList());
				resultNoseSniff.setFont(new Font(display,"Calibri", 12, SWT.NULL));
				resultNoseSniff.setLayoutData(gridData);
				
				resultNoseScratch.setText("Now you feel: "+model.brain.getDataList());
				resultNoseScratch.setFont(new Font(display,"Calibri", 12, SWT.NULL));
				resultNoseScratch.setLayoutData(gridData);
				
				resultMouthEat.setText("Now you eat: "+model.brain.getDataList());
				resultMouthEat.setFont(new Font(display,"Calibri", 12, SWT.NULL));
				resultMouthEat.setLayoutData(gridData);
			
				resultMouthSay.setText("Now you are talking: "+model.brain.getDataList());
				resultMouthSay.setFont(new Font(display,"Calibri", 12, SWT.NULL));
				resultMouthSay.setLayoutData(gridData);	
				
				resultNoseSniff.setText("Now you listen: "+model.brain.getDataList());
				resultNoseSniff.setFont(new Font(display,"Calibri", 12, SWT.NULL));
				resultNoseSniff.setLayoutData(gridData);
			}
		});	
		return shell;			
	}
	
	public static void main(String[]args) {
		Display display=new Display();
		Shell shell = ConfigureShell(display);
		shell.open();
		
		while(!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		
	}
}

