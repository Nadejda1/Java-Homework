import java.util.Scanner;

public class H3_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Pls insert N:");
		int N = input.nextInt();
		System.out.println("Pls insert K != N:");
		int K = input.nextInt();
		if (N != K) {
			int NFactoriel = 1;
			int KFactoriel = 1;
			int NminKfactorial = 1;
			for (int i = 1; i < (N+1); i++) {
				NFactoriel = NFactoriel * i;

			}System.out.println(NFactoriel);
			for (int j = 1; j < (K+1); j++) {
				KFactoriel = KFactoriel * j;
			}System.out.println(KFactoriel);
			for (int k = 1; k < ((N-K)+1); k++) {
				NminKfactorial = NminKfactorial * k;
			}
			System.out.println(NminKfactorial);
			double Result = (NFactoriel * KFactoriel)/NminKfactorial;
			System.out.println("N!*K!/(N-K)! = " + Result);

		}

	}
}
