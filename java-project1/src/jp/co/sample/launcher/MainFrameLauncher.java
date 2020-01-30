package jp.co.sample.launcher;

import javax.swing.JFrame;

import jp.co.sample.gui.MainFrame;
import jp.co.sample.util.SomethingUtils;

public class MainFrameLauncher {

	private static final String TEST_STR = "ソース3修正"; // ←ここ
	
	public static void main(String[] args) {
		JFrame frame = new MainFrame();
		frame.setVisible(true);
		SomethingUtils.printToConsole(frame.getTitle() + "が起動されました。");
	}

}
