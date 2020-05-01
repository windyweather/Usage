package com.ww.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.FocusManager;
import javax.swing.JCheckBox;
import javax.swing.JTree;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.JSeparator;
import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.beans.EventHandler;

import javax.swing.SwingConstants;

public class UsageMainView extends JFrame implements ActionListener {

	// get rid of a warning about serialization.
	private static final long serialVersionUID = 19837505L;
	
	protected JFrame frmUsageOfDisk;
	protected JComboBox<String> cbPathChoice;
	protected JLabel lbStatus;
	protected JTree treeFileInfo;
	protected JCheckBox ckbxConfirmDelete;
	protected JCheckBox ckbxOverrideReadOnly;
	protected JComboBox<String> cbFileSizeChoice;

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
	
	
	/**
	 * Launch the application.
	 * Now in our child class
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsageMainView window = new UsageMainView();
					window.frmUsageOfDisk.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/

	/**
	 * Create the application.
	 */
	public UsageMainView() {
		initialize();
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		/*
		// this one is NULL
		Window pview = (Window)getParent();
		
		pview.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println( "viewParent windowClosing" );
				// Find ourselves in the great beyond
				UsageMainView win = (UsageMainView)e.getWindow();
				win.windowClosingEvent(e); // call us, which will call our child too
			}
		});
		*/
		/*
		// this one is null too
		Window pwin = (Window)frmUsageOfDisk.getParent();
		
		pwin.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println( "frmUsageOfDisk Parent windowClosing" );
				// Find ourselves in the great beyond
				UsageMainView win = (UsageMainView)e.getWindow();
				win.windowClosingEvent(e); // call us, which will call our child too
			}
		});
		*/
		
		
		frmUsageOfDisk.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println( "frmUsageOfDisk windowClosing" );
				// Find ourselves in the great beyond
				UsageMainView win = (UsageMainView)e.getWindow();
				win.windowClosingEvent(e); // call us, which will call our child too
			}
		});
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println( "UsageMainView windowClosing" );
				// Find ourselves in the great beyond
				UsageMainView win = (UsageMainView)e.getWindow();
				win.windowClosingEvent(e); // call us, which will call our child too
			}
		});
		

		
		
	}
	
	/*
	 * Call this sometime after we are active
	 */
	public void setActiveWindowClosingEvent()
	{
		Window activeWindow = FocusManager.getCurrentManager().getActiveWindow();
		if ( activeWindow != null ) {
			activeWindow.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.out.println( "FocusManager Active Window windowClosing" );
					// Find ourselves in the great beyond
					UsageMainView win = (UsageMainView)e.getWindow();
					win.windowClosingEvent(e); // call us, which will call our child too
				}
			});
		}
	}

	// we will overload this in the child class
	// use the same one for every action
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
	    System.out.println( "UsageMainView::actionPerformed "+actionCommand );
	}
	
	// catch window closing with our own method
	// this is overridden in the child to save stuff before exit
	public void windowClosingEvent(WindowEvent e) {
		System.out.println( "UsageMainView windowClosingEvent" );
	}
		
	
	/**
	 * Initialize the contents of the frame.
	 */
	protected void initialize() {
		frmUsageOfDisk = new JFrame();
		frmUsageOfDisk.setTitle("Usage of Disk Space");
		frmUsageOfDisk.setBounds(100, 100, 681, 597);
		frmUsageOfDisk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Directory Space Usage Starting At");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		cbPathChoice = new JComboBox<String>();
		cbPathChoice.setModel(new DefaultComboBoxModel<String>(new String[] {"D:\\Downloads\\Discord Chat and Message App", "F:\\VideoScratch\\WinCaps"}));
		cbPathChoice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBrowsePath = new JButton("...");
		btnBrowsePath.setActionCommand("btnBrowsePath");
		btnBrowsePath.addActionListener(this);
		btnBrowsePath.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JScrollPane scrollPane = new JScrollPane();
		
		lbStatus = new JLabel("status");
		lbStatus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JSeparator separator = new JSeparator();
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JButton btnClose = new JButton("Close");
		btnClose.setActionCommand("btnClose");
		btnClose.addActionListener(this);
		btnClose.setPreferredSize(new Dimension(55, 21));
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnClose.setAlignmentY(0.0f);
		GroupLayout groupLayout = new GroupLayout(frmUsageOfDisk.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(cbPathChoice, 0, 584, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(btnBrowsePath))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 638, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lbStatus, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnClose, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBrowsePath)
						.addComponent(cbPathChoice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(39)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
							.addComponent(btnClose, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lbStatus)
					.addGap(15))
		);
		
		treeFileInfo = new JTree();
		treeFileInfo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane.setViewportView(treeFileInfo);
		panel_1.setLayout(null);
		
		ckbxConfirmDelete = new JCheckBox("Confirm Delete");
		ckbxConfirmDelete.setBounds(6, 6, 119, 25);
		panel_1.add(ckbxConfirmDelete);
		ckbxConfirmDelete.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		ckbxOverrideReadOnly = new JCheckBox("Override ReadOnly");
		ckbxOverrideReadOnly.setBounds(152, 6, 156, 25);
		panel_1.add(ckbxOverrideReadOnly);
		ckbxOverrideReadOnly.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1 = new JLabel("Show  Files Larger Than");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(362, 10, 162, 17);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		cbFileSizeChoice = new JComboBox();
		cbFileSizeChoice.setBounds(531, 7, 97, 23);
		panel_1.add(cbFileSizeChoice);
		cbFileSizeChoice.setModel(new DefaultComboBoxModel<String>(new String[] {"NONE", "1 MB", "2 MB", "5 MB", "10 MB", "20 MB", "50 MB", "100 MB", "200 MB", "500 MB", "1 GB", "2 GB", "5 GB", "10 GB"}));
		cbFileSizeChoice.setEditable(false);
		cbFileSizeChoice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.setLayout(null);
		
		JButton btnScan = new JButton("Scan");
		btnScan.setActionCommand("btnScan");
		btnScan.addActionListener(this);
		btnScan.setBounds(0, 1, 111, 31);
		panel.add(btnScan);
		btnScan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnScan.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JButton btnNoFiles = new JButton("No Files");
		btnNoFiles.setActionCommand("btnNoFiles");
		btnNoFiles.addActionListener(this);
		btnNoFiles.setBounds(0, 42, 111, 31);
		panel.add(btnNoFiles);
		btnNoFiles.setPreferredSize(new Dimension(55, 21));
		btnNoFiles.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNoFiles.setAlignmentX(1.0f);
		
		JButton btnAllFiles = new JButton("All Files");
		btnAllFiles.setActionCommand("btnAllFiles");
		btnAllFiles.addActionListener(this);
		btnAllFiles.setBounds(0, 88, 111, 31);
		panel.add(btnAllFiles);
		btnAllFiles.setPreferredSize(new Dimension(55, 21));
		btnAllFiles.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAllFiles.setAlignmentY(0.0f);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setActionCommand("btnDelete");
		btnDelete.addActionListener(this);
		btnDelete.setPreferredSize(new Dimension(55, 21));
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDelete.setAlignmentY(0.0f);
		btnDelete.setBounds(0, 170, 111, 31);
		panel.add(btnDelete);
		
		JButton btnSetPath = new JButton("Set Path");
		btnSetPath.setActionCommand("btnSetPath");
		btnSetPath.addActionListener(this);
		btnSetPath.setPreferredSize(new Dimension(55, 21));
		btnSetPath.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSetPath.setAlignmentY(0.0f);
		btnSetPath.setBounds(0, 129, 111, 31);
		panel.add(btnSetPath);
		frmUsageOfDisk.getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		frmUsageOfDisk.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmSaveTree = new JMenuItem("Save Tree..");
		mntmSaveTree.setActionCommand("mntmSaveTree");
		mntmSaveTree.addActionListener(this);
		mntmSaveTree.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu.add(mntmSaveTree);
		
		JMenuItem mntmQuit = new JMenuItem("Quit");
		mntmQuit.setActionCommand("mntmQuit");
		mntmQuit.addActionListener(this);
		mntmQuit.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu.add(mntmQuit);
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmAbout = new JMenuItem("About...");
		mntmAbout.setActionCommand("mntmAbout");
		mntmAbout.addActionListener(this);
		mntmAbout.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu_1.add(mntmAbout);
	}
}
