package fluent;

import builder.FabricaViolaoBuilder;
import model.Violao;

/**
 * 
 * @author Dione
 *
 */
public class Client {

	public static void main(String[] args) {

		Violao classico = new FabricaViolaoBuilder("A�o")

				.andModelo("C�ssico")
				.forPreco("700.00")
				.andCor("Rosa")
				.andBraco("42cm")
				.andTarraxa("Pino grosso")
				.andMaterial("madeira")
				.thatsAll();
		System.out.println(classico);
		// =>qdo n�o tem no estoque - null ao colocar (".thisAll") sem os dados
		Violao folk = new FabricaViolaoBuilder("A�o")// .thatsAll();

				.andModelo("Folk")
				.forPreco("559.50")
				.andCor("Preto")
				.andBraco("44cm")
				.andTarraxa("Marca Rubner Dourada")
				.andMaterial("Madeira")
				.thatsAll();
		System.out.println(folk);

		Violao flet = new FabricaViolaoBuilder("Naylon")

				.andModelo("Flet")
				.forPreco("797.58")
				.andCor("Branco")
				.andBraco("44cm")
				.andTarraxa("Pino fino")
				.andMaterial("Madeira")
				.thatsAll();
		System.out.println(flet);

		Violao jumbo = new FabricaViolaoBuilder("A�o")

				.andModelo("Jumbo")
				.forPreco("4998.00")
				.andCor("Laranja")
				.andBraco("42cm")
				.andTarraxa("Pino grosso")
				.andMaterial("Madeira")
				.thatsAll();
		System.out.println(jumbo);

		Violao seteCordas = new FabricaViolaoBuilder("A�o")

				.andModelo("7 Cordas")
				.forPreco("3500.00")
				.andCor("Marrom")
				.andBraco("42cm")
				.andTarraxa("Pino fino")
				.andMaterial("Madeira")
				.thatsAll();
		System.out.println(seteCordas);

		Violao dozeCordas = new FabricaViolaoBuilder("A�o")

				.andModelo("12 Cordas")
				.forPreco("1618.68")
				.andCor("Bege")
				.andBraco("42cm")
				.andTarraxa("Pino grosso")
				.andMaterial("Madeira")
				.thatsAll();
		System.out.println(dozeCordas);

		Violao zero = new FabricaViolaoBuilder("A�o")

				.andModelo("Zero")
				.forPreco("774.60")
				.andCor("Bege")
				.andBraco("34cm")
				.andTarraxa("Pino fino")
				.andMaterial("Mdeira")
				.thatsAll();
		System.out.println(zero);

		Violao duploZero = new FabricaViolaoBuilder("A�o")

				.andModelo("duploZero")
				.forPreco("900.00")
				.andCor("Bege")
				.andBraco("32cm")
				.andTarraxa("Pino fino")
				.andMaterial("Madeira").thatsAll();
		System.out.println(duploZero);

		Violao triploZero = new FabricaViolaoBuilder("A�o")

				.andModelo("triploZero").forPreco("400.00").andCor("Rosa").andBraco("42cm").andTarraxa("Pino grosso")
				.andMaterial("madeira").thatsAll();
		System.out.println(triploZero);

	}
}
