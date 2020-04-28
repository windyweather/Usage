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
import javax.swing.SwingConstants;

public class UsageMainView {

	private JFrame frmUsageOfDisk;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public UsageMainView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUsageOfDisk = new JFrame();
		frmUsageOfDisk.setTitle("Usage of Disk Space");
		frmUsageOfDisk.setBounds(100, 100, 681, 597);
		frmUsageOfDisk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Directory Space Usage Starting At");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"D:\\Downloads\\Discord Chat and Message App", "F:\\VideoScratch\\WinCaps"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnNewButton = new JButton("...");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel_2 = new JLabel("status");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JSeparator separator = new JSeparator();
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JButton btnNewButton_1_1_2_1 = new JButton("Close");
		btnNewButton_1_1_2_1.setPreferredSize(new Dimension(55, 21));
		btnNewButton_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1_2_1.setAlignmentY(0.0f);
		GroupLayout groupLayout = new GroupLayout(frmUsageOfDisk.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(comboBox, 0, 584, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(btnNewButton))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 638, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_1_1_2_1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)))
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
						.addComponent(btnNewButton)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
							.addComponent(btnNewButton_1_1_2_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2)
					.addGap(15))
		);
		
		JTree tree = new JTree();
		scrollPane.setViewportView(tree);
		panel_1.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Confirm Delete");
		chckbxNewCheckBox.setBounds(6, 6, 119, 25);
		panel_1.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Override ReadOnly");
		chckbxNewCheckBox_1.setBounds(152, 6, 156, 25);
		panel_1.add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1 = new JLabel("Show  Files Larger Than");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(362, 10, 162, 17);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(531, 7, 97, 23);
		panel_1.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"NONE", "1 MB", "2 MB", "5 MB", "10 MB", "20 MB", "50 MB", "100 MB", "200 MB", "500 MB", "1 GB", "2 GB", "5 GB", "10 GB"}));
		comboBox_1.setEditable(true);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Scan");
		btnNewButton_1.setBounds(0, 1, 111, 31);
		panel.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JButton btnNewButton_1_1_1 = new JButton("No Files");
		btnNewButton_1_1_1.setBounds(0, 42, 111, 31);
		panel.add(btnNewButton_1_1_1);
		btnNewButton_1_1_1.setPreferredSize(new Dimension(55, 21));
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1_1.setAlignmentX(1.0f);
		
		JButton btnNewButton_1_1 = new JButton("All Files");
		btnNewButton_1_1.setBounds(0, 88, 111, 31);
		panel.add(btnNewButton_1_1);
		btnNewButton_1_1.setPreferredSize(new Dimension(55, 21));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1.setAlignmentY(0.0f);
		
		JButton btnNewButton_1_1_2 = new JButton("Delete");
		btnNewButton_1_1_2.setPreferredSize(new Dimension(55, 21));
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1_2.setAlignmentY(0.0f);
		btnNewButton_1_1_2.setBounds(0, 170, 111, 31);
		panel.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_3 = new JButton("Set");
		btnNewButton_1_1_3.setPreferredSize(new Dimension(55, 21));
		btnNewButton_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1_3.setAlignmentY(0.0f);
		btnNewButton_1_1_3.setBounds(0, 129, 111, 31);
		panel.add(btnNewButton_1_1_3);
		frmUsageOfDisk.getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		frmUsageOfDisk.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Save Tree..");
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Quit");
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("About...");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnNewMenu_1.add(mntmNewMenuItem);
	}
}
