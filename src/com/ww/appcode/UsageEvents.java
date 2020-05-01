/**
 * 
 */
package com.ww.appcode;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.ww.views.UsageMainView;

/**
 * @author Darrell
 *
 */
public class UsageEvents extends UsageMainView implements ActionListener {

	// get rid of a warning about serialization.
	private static final long serialVersionUID = 19837507L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsageEvents window = new UsageEvents();
					frmUsageOfDisk.setVisible(true);
					
					// add a window closing listener to catch the [X] button
					frmUsageOfDisk.addWindowListener(new WindowAdapter() {
						@Override
						public void windowClosing(WindowEvent e) {
							System.out.println( "main windowClosing" );
							// call a method to save our stuff
							window.closeOurApplication();
						}
					});

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * Controls we need access to
	 */
	/*
	protected JComboBox cbPathChoice;
	protected JLabel lbStatus;
	protected JTree treeFileInfo;
	protected JCheckBox ckbxConfirmDelete;
	protected JCheckBox ckbxOverrideReadOnly;
	protected JComboBox cbFileSizeChoice;
	*/
	
	
	
	//
	// Put some text in the status line to say what's up
	//
	public void setStatus( String sts ) {
		
		lbStatus.setText( sts );
	}

	/*
	 * usually means that everything worked up to now
	*/
	public boolean isStatusEmpty() {
		return lbStatus.getText().isEmpty();
	}
	
	private boolean isOsWindows()
	{
		String osName = System.getProperty ("os.name");
		if ( osName.contains("Windows") ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private boolean isOsLinux()
	{
		String osName = System.getProperty ("os.name");
		if ( osName.contains("Linux") ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//
	// Do this in one place so we can easily turn it off later
	//
	private void printSysOut( String str ) {
		System.out.println(str);
	}

	
	public UsageEvents() {
		printSysOut("UsageEvents constructor reached");
		
		super.initialize();

		
		// restore defaults
	}
	
	/*
	 * close down our app. Save whatever we need to on the way out.
	 * This scheme catches the [X] button in the window title bar.
	 */
	public void closeOurApplication()
	{
		printSysOut( "UsageEvents closeOurApplication - save your stuff here" );
		// write the defaults file
		//saveDefaultsFile();
		
		// Need to exit since our base class is different
		// from the previous version of this program.
	    System.exit(0);
	}
	
	// catch the window closing event
	// passed here with a nightmare, but hey, that's Java and AWT/Swing for you.
	//@Override
	public void windowClosingEvent(WindowEvent e) {
		
		printSysOut( "UsageEvents windowClosing" );

		closeOurApplication();
	}
	
	
	
	/**
	* Catch all the events here in the child class
	* use the same actionPerformed listener for every action
	* Qt has it's problems, but at least you don't have to write
	* a command dispatcher. Here in Java, it looks like the easiest way
	* to deal with events from a GUI is to use setActionCommand("string") and
	* then to dispatch those commands here.
	* 
	* In Qt, the dispatcher is built into the framework, so you don't need to build
	* a dispatcher based on text string. Oh Well. Deployment in Qt is a nightmare,
	* which is why I'm here, and this is much less of a problem than the Qt Deployment
	* issue.
	* 
	* Note we are using the meaningful Gui Object name, like btnAddShow or
	* mntmHelpDialog as the "command string", just to keep things consistent
	* and easy. And of course, we have moved all event processing to the child class.
	* Separation of Form and Function into different classes.
	**/
	@Override
	public void actionPerformed(ActionEvent e) {
		//printSysOut( "ShowRunnerEvents::actionPerformed" );
		// get the command string we set in the dialog
	    String actionCommand = e.getActionCommand();

	    //printSysOut( "ShowRunnerEvents::actionPerformed "+actionCommand );
	    // build a dispatcher on those command strings, which are the names
	    // of the gui items to keep it simple.
	    // don't do code here, but call another method to actually do the work
	    // to keep the dispatcher more readable.
	    printSysOut( "UsageEvents::actionPerformed "+actionCommand );
	    switch (actionCommand) {
	    case "btnBrowsePath":
	    	//browseForImpressProgram();
    	break;
        case "btnScan": 
        	//scanFilesToTree();
        break;
        case "btnNoFiles": 
        	//noFilesAtPath();
        break;
        case "btnAllFiles": {
        	//allFilesAtPath();
        	break;
        }
        case "btnDelete": {
        	//deleteFilesAtPath();
        	break;
        }
        case "btnSetPath": {
        	//setPathToList();
        	break;
        }

        case "mntmSaveTree": {
        	//saveTreeAsFile();
        	break;
        }

        case "mntmSaveDefaults": {
        	//saveDefaultsFile();
        	break;
        }
        case "mntmRestoreDefaults": {
        	//restoreDefaultsFile();
        	break;
        }
        
        case "btnClose":{
        	// do as little as possible
        	// allow the framework to do it all
        	//frmUsageOfDisk.dispatchEvent(new WindowEvent(frmUsageOfDisk, WindowEvent.WINDOW_CLOSING));
        	closeOurApplication();
        	break;
        	
        }
        case "mntmQuit": {
        	// do as little as possible
        	// allow the framework to do it all
        	//frmUsageOfDisk.dispatchEvent(new WindowEvent(frmUsageOfDisk, WindowEvent.WINDOW_CLOSING));
        	closeOurApplication();
        	break;
        	
        }
        case "mntmAbout": {
        	//showAboutDialog();
        	break;
        }
        default:
        {
    	    printSysOut( "UsageEvents::Woops "+actionCommand );
        	break;
        }
	    }
	}

	/*
	 * btnBrowsePath
	 * btnClose
	 * btnScan
	 * btnNoFiles
	 * btnAllFiles
	 * btnDelete
	 * btnSetPath
	 * mntmAbout
	 * mntmQuit
	 * mntmSaveTree
	 * 
	 */
	
	
}
