package Tela;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

public class CenterScreen {

	public static void CentralizaWindow(Container container) {

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		int width = screenSize.width;
		int height = screenSize.height;
		int contWidth = container.getWidth();
		int contHeight = container.getHeight();

		container.setLocation((width - contWidth) / 2,
				(height - contHeight) / 2);

	}

}
