package Florian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Klasse der main-Funktion.
 */
public class App {
	/**
	 * Hauptprogramm liest einen String ein und gibt diesen in Großbuchstaben
	 * aus.
	 */
	public static void main(String[] args) {
		try {
			String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
			System.out.println(s.toUpperCase());
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
