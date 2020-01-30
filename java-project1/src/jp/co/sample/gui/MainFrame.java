package jp.co.sample.gui;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	public MainFrame() {
		setTitle("Hello World!");
		setBounds(100, 100, 600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("ソース1修正"); // ←ここ
	}

}
