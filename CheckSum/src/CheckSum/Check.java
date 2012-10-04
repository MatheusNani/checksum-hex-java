package CheckSum;

public class Check {

	public static void main(String args[]) {

		String teste = "Msg:SUIN,Dt:01359149,240212110557.000,2309.4339,S,04702.1557,W,0.00,00,End";

		int i = 0;

		String hexa = "";

		String t = teste.substring(0, teste.length() - 6);

		System.out.println(t);

		for (byte b : t.getBytes()) {

			i += b;

			hexa = Integer.toHexString(i);

		}

		// soma = hexa;
		System.out.println(hexa);

	}
}
