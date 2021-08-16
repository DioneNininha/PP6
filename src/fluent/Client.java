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

		Violao classico = new FabricaViolaoBuilder("Aço")

				.andModelo("Cássico")
				.forPreco("700.00")
				.andCor("Rosa")
				.andBraco("42cm")
				.andTarraxa("Pino grosso")
				.andMaterial("madeira")
				.thatsAll();
		System.out.println(classico);
		// =>qdo não tem no estoque - null ao colocar (".thisAll") sem os dados
		Violao folk = new FabricaViolaoBuilder("Aço")// .thatsAll();

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

		Violao jumbo = new FabricaViolaoBuilder("Aço")

				.andModelo("Jumbo")
				.forPreco("4998.00")
				.andCor("Laranja")
				.andBraco("42cm")
				.andTarraxa("Pino grosso")
				.andMaterial("Madeira")
				.thatsAll();
		System.out.println(jumbo);

		Violao seteCordas = new FabricaViolaoBuilder("Aço")

				.andModelo("7 Cordas")
				.forPreco("3500.00")
				.andCor("Marrom")
				.andBraco("42cm")
				.andTarraxa("Pino fino")
				.andMaterial("Madeira")
				.thatsAll();
		System.out.println(seteCordas);

		Violao dozeCordas = new FabricaViolaoBuilder("Aço")

				.andModelo("12 Cordas")
				.forPreco("1618.68")
				.andCor("Bege")
				.andBraco("42cm")
				.andTarraxa("Pino grosso")
				.andMaterial("Madeira")
				.thatsAll();
		System.out.println(dozeCordas);

		Violao zero = new FabricaViolaoBuilder("Aço")

				.andModelo("Zero")
				.forPreco("774.60")
				.andCor("Bege")
				.andBraco("34cm")
				.andTarraxa("Pino fino")
				.andMaterial("Mdeira")
				.thatsAll();
		System.out.println(zero);

		Violao duploZero = new FabricaViolaoBuilder("Aço")

				.andModelo("duploZero")
				.forPreco("900.00")
				.andCor("Bege")
				.andBraco("32cm")
				.andTarraxa("Pino fino")
				.andMaterial("Madeira").thatsAll();
		System.out.println(duploZero);

		Violao triploZero = new FabricaViolaoBuilder("Aço")

				.andModelo("triploZero").forPreco("400.00").andCor("Rosa").andBraco("42cm").andTarraxa("Pino grosso")
				.andMaterial("madeira").thatsAll();
		System.out.println(triploZero);

	}
}
