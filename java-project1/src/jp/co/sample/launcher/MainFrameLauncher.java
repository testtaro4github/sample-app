package jp.co.sample.launcher;

import javax.swing.JFrame;

import jp.co.sample.gui.MainFrame;
import jp.co.sample.util.SomethingUtils;

public class MainFrameLauncher {

	public static void main(String[] args) {
		JFrame frame = new MainFrame();
		frame.setVisible(true);
		SomethingUtils.printToConsole(frame.getTitle() + "が起動されました。");
		System.out.println("ソース3修正"); // ← ここ
	}

}
