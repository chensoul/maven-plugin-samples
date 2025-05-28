package cc.chensoul;

import java.io.IOException;

import cc.chensoul.interfaces.cli.CliUserInterface;

public class Application {

	public static void main(final String[] args) throws IOException {
		final CliUserInterface cliUserInterface = new CliUserInterface(args);
		cliUserInterface.compute();
	}
}
